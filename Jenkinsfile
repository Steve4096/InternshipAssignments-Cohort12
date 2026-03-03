pipeline {
    agent any

    triggers {
        githubPush()
    }

    environment {
        BUILD_DIR = "built"
        REPO_URL = "https://github.com/Steve4096/InternshipAssignments-Cohort12.git"
        BRANCH = "master"
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: "${BRANCH}",
                        credentialsId: 'jenkins-github-creds',
                        url: "${REPO_URL}"
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Create built Directory') {
            steps {
                sh '''
                    mkdir -p ${BUILD_DIR}
                    cp target/*.jar ${BUILD_DIR}/
                '''
            }
        }
    }

    post {
        success {
            echo "Build successful. .jar stored in built/"
            archiveArtifacts artifacts: 'built/*.jar', fingerprint: true
        }
        failure {
            echo "Build failed"
        }
    }
}
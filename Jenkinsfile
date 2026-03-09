pipeline {
    agent any

    triggers {
        githubPush()
    }

    environment {
        BUILD_DIR = "built"
        REPO_URL = "https://github.com/Steve4096/InternshipAssignments-Cohort12.git"
        BRANCH = "main"

        IMAGE_NAME = "steve4096/internship_assignments"
        VERSION = "${BUILD_NUMBER}"
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

        stage('Prepare Artifact') {
            steps {
                sh '''
                mkdir -p ${BUILD_DIR}
                cp target/*.jar ${BUILD_DIR}/app.jar
                '''
            }
        }

        stage('Build Docker Image') {
            steps {
                sh '''
                echo "Building Docker image ${IMAGE_NAME}:${VERSION}"
                docker build -t ${IMAGE_NAME}:${VERSION} .
                docker tag ${IMAGE_NAME}:${VERSION} ${IMAGE_NAME}:latest
                docker images
                '''
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withCredentials([usernamePassword(
                        credentialsId: 'dockerhub-creds',
                        usernameVariable: 'DOCKER_USER',
                        passwordVariable: 'DOCKER_PASS'
                )]) {
                    sh '''
                    echo "Logging into Docker Hub as $DOCKER_USER"
                    echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin

                    echo "Pushing Docker image ${IMAGE_NAME}:${VERSION}"
                    docker push ${IMAGE_NAME}:${VERSION}

                    echo "Pushing Docker image ${IMAGE_NAME}:latest"
                    docker push ${IMAGE_NAME}:latest

                    docker logout
                    '''
                }
            }
        }
    }

    post {
        success {
            echo "Docker image pushed successfully!"
        }
        failure {
            echo "Build or Docker push failed!"
        }
    }
}
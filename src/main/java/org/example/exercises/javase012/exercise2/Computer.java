package org.example.exercises.javase012.exercise2;

public class Computer {
    private  String brand;
    private  String model;
    private  double price;

    public Computer(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public void displayInfo(){
        System.out.println("Computer brand: "+brand);
        System.out.println("Computer model: "+model);
        System.out.println("Computer price: "+price);
    }

    public static class Processor{
        private String type;
        private double speed;
        private int cores;

        public Processor(String type,double speed,int cores){
            this.type=type;
            this.cores=cores;
            this.speed=speed;
        }

        public void displayInfo(){
            System.out.println("Processor type: "+type);
            System.out.println("Processor speed: "+speed);
            System.out.println("Number of cores: "+cores);
        }

        public static void gratitude(){
            System.out.println("Thank you for buying from us. We hope to see you again soon");
        }
    }

    public class Memory{
        private String storage;
        private double ram;

        public Memory(String storage,double ram){
            this.storage=storage;
            this.ram=ram;
        }

        public void displayInfo(){
            System.out.println("Memory: "+storage);
            System.out.println("RAM: "+ram);
        }
    }
}

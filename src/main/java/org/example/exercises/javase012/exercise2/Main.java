package org.example.exercises.javase012.exercise2;

public class Main {
    public static void main(String[] args) {
//        Computer.Processor processor=new Computer.Processor("Pentium",4.5,4);
//        Computer.Processor processor1=new Computer.Processor("Intel core",17,7);
//
//        System.out.println("PROCESSOR 1");
//        processor.displayInfo();
//        Computer.Processor.gratitude();
//        System.out.println();
//        System.out.println("PROCESSOR 2");
//        processor1.displayInfo();
//        Computer.Processor.gratitude();

        Computer computer=new Computer("Lenovo","Ideapad",50_000);
        Computer computer1=new Computer("Samsung","Notebook",500_000);
        Computer.Processor processor=new Computer.Processor("Pentium", 4.5, 4);
        Computer.Processor processor1=new Computer.Processor("Intel Core i7", 3.8, 8);
        Computer.Memory memory=computer.new Memory("512GB SSD", 16);
        Computer.Memory memory1=computer1.new Memory("1TB HDD", 32);

        System.out.println("COMPUTER 1");
        computer.displayInfo();
        processor.displayInfo();
        memory.displayInfo();

        System.out.println();

        System.out.println("COMPUTER 2");
        computer1.displayInfo();
        processor1.displayInfo();
        memory1.displayInfo();
    }
}

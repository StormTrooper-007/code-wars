package org.example;

public class Computer {
    int com = 3;
    public  void startup() throws RuntimeException{
        System.out.println("computer-");
    }

    public void anotherMethod(){
        //startup();
    }

    public static void main(String[] args) {
        var laptop = new Laptop();
        Computer computer = new Computer();
        laptop.startup();
        computer.startup();
    }
}

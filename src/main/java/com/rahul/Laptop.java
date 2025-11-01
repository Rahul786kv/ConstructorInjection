package com.rahul;

public class Laptop {
    int age;
    public Laptop(){
        System.out.println("Laptop object created");
    }

    public Laptop(int age){
        System.out.println("Para constructor called");
        this.age = age;
    }

    public void compile() {
        System.out.println("Compilation successful");
    }
}

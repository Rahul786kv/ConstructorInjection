package com.rahul;

public class Laptop implements Computer {
    int age;
    public Laptop(){
        System.out.println("Laptop object created");
    }

    public Laptop(int age){
        System.out.println("Para constructor called");
        this.age = age;
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Laptop");
    }
}

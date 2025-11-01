package com.rahul;

import java.beans.ConstructorProperties;

public class Developer {

    private int age;
    private Laptop lap;
    public Developer(){
        System.out.println("Developer default constructor called and default object created");
    }

    public Developer(int age){
        System.out.println("Developer age param object created");
    }

    @ConstructorProperties({"age", "lap"})
    public Developer(int age, Laptop lap){
        System.out.println("Parameterized Developer constructor called");
    }

    public void code(){
        System.out.println("Coding");
        lap.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}

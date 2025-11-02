package com.rahul;

public class Desktop implements Computer{

    Desktop(){
        System.out.println("Desktop object invoked");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop");
    }
}

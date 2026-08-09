package com.essentials;

public class HelloWorld {

    public String greet() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.greet());
    }
}

package com.example;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(projectConfig.class)
        
        System.out.println("Hello world!");
    }
}
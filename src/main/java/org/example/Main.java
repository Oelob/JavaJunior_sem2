package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        methods(Example.class);
    }

    public static void methods(Class<?> clazz){
        List.of(clazz.getMethods()).stream().forEach(System.out::println);
    }

}
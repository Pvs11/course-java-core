package com.rakovets.course.java.core.practice.exception_handling;

public class Demo2 {
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        try {
            t2.getElement(3);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}

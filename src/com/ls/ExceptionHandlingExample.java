package com.ls;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            // Accessing an index out of bounds
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " );
        } finally {
            System.out.println("Inside finally block");
        }
    }
}

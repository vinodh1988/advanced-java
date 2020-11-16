package com.inter;

public class LibraryClass {
    public static void LibraryMethod(Task task) {
    	System.out.println("Started Performing Task");
    	System.out.println("Preprocessing Task1");
    	task.activity("task1");
    	System.out.println("Finished Task1 ");
    	System.out.println("Preprocessing Task2");
    	task.activity("task2");
    }
}

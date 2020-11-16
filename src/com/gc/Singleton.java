package com.gc;

public class Singleton {
   private final static Singleton instance =new Singleton();
   
   public String toString() {
      return super.hashCode()+" is the hashcode of Singleton object";
   }
   
   private Singleton() {}
   
   public void display() {
	   System.out.println("Instance method running");
   }
   public static Singleton getInstance() {
	   return instance;
   }
}

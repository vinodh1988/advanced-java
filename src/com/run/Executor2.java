package com.run;

import com.gc.Singleton;

public class Executor2 {
   public static void main(String n[]) {
	   Singleton s1=Singleton.getInstance();
	   Singleton s2=Singleton.getInstance();
	   Singleton s3=Singleton.getInstance();
	   
	   
	   s1.display();
	   s2.display();
	   s3.display();
	   
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s3);
   }
}

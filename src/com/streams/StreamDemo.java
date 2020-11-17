package com.streams;

import java.util.stream.Stream;

//Streams in java is usually operated on collections
//it reads collection  -input
//it perform some intermediate operations  -process
//if needed some terminal operations also performed  - output
public class StreamDemo {
   public static void main(String n[]) {
	   String []names = {
			  "George","Nicholas","Chris","Manish","Jackson","Vikram"
	   };
	   
	   Stream<String> stream = Stream.of(names);
	   stream.forEach(x -> System.out.println(x.toUpperCase()) );
	   
	   System.out.println("---------------------------------");
	   
	   //stream.forEach(x -> System.out.println(x.toUpperCase()) );
	   
   }
}

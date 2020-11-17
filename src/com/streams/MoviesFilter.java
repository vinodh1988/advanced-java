package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MoviesFilter {
 public static Predicate<String> movierating=MoviesFilter::filterIt;
   public static void main(String n[]) {
	   try {
			Stream<String> stream = Files.lines(Paths.get("d:\\movies.csv"));
			//stream.forEach(MoviesFilter::processIt);
			stream.filter(movierating).forEach(MoviesFilter::processIt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
   
   public static void processIt(String x) {
	   String n[] =x.split(",");
	   System.out.printf("\n%40s %10s" ,n[0],n[3]);
   }
   
   public static boolean filterIt(String x) {
	   String n[] =x.split(",");
	 //  System.out.println(Integer.parseInt(n[3])>75?true:false);
	   try {
	   return Integer.parseInt(n[3])>82?true:false;
	   }
	   catch(NumberFormatException e) {
		   return false;
	   }
	  
   }
}

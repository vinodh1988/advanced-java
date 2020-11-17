package com.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MoviesFilter {
   public static void main(String n[]) {
	   try {
			Stream<String> stream = Files.lines(Paths.get("d:\\movies.csv"));
			stream.forEach(MoviesFilter::processIt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
   
   public static void processIt(String x) {
	   String n[] =x.split(",");
	   System.out.printf("\n%40s %10s" ,n[0],n[3]);
   }
}

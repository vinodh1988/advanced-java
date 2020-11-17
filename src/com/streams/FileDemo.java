package com.streams;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileDemo {
  public static void main(String[] args) {
	
	  try {
		Stream<String> stream = Files.lines(Paths.get("d:\\birthplace.csv"));
		stream.forEach(x -> System.out.println(x));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
  }
}

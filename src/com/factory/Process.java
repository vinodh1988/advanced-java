package com.factory;

import java.util.List;

public class Process {
   public static void activity(List<Task> t) {
	   for(Task x : t) {
		   x.perform();
	   }
   }
}

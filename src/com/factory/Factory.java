package com.factory;

public class Factory {
	 private final static Heat heat =new Heat();
	  private final static Mix mix=new Mix();
	  private final static Measure measure =new Measure();
	  private final static Pack pack =new Pack();
  public static Task getInstance(String task) {
	 
	  switch(task) {
	  case "heat": 
		     return heat;
	  case "mix": 
		     return mix;
	  case "pack": 
		     return pack;
	  case "measure": 
		     return measure;
	  default:
		     return null;
	  }
  }
}

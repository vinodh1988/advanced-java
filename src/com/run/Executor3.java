package com.run;

import java.util.ArrayList;
import java.util.List;

import com.factory.Factory;
import com.factory.Task;

public class Executor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Task> list=new ArrayList<Task>();
       list.add(Factory.getInstance("measure"));
       list.add(Factory.getInstance("mix"));
       list.add(Factory.getInstance("heat"));
       list.add(Factory.getInstance("pack"));
       com.factory.Process.activity(list);
	}

}

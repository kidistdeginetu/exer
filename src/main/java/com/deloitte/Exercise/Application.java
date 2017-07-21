package com.deloitte.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	 static Logger log = Logger.getLogger(Application.class.getName());
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		
		JavaExercise javaExercise = context.getBean("javaExercise", JavaExercise.class);
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please input the strings");
		System.out.println("please enter y to stop and display the result");
		String input="";
		List<String>mapList=new ArrayList<String>();
		
			
     		
	while(!(input=scan.nextLine()).equals("y")){
	
	mapList.add(input);
		
	}
     		
     		
         
			javaExercise.maskedProcessor(mapList);

	}
}
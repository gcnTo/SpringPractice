package com.luv2code.animals;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Animal theAnimal = context.getBean("myAnimal", Animal.class);
		
		System.out.println(theAnimal.getFamilia());
		System.out.println(theAnimal.getBreed());
		
		context.close();

	}

}

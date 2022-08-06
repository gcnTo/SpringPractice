package com.luv2code.animals;

public abstract class Dog implements Animal {

	@Override
	public String getFamilia() {
		
		return "I'm a Dog";
	}

	@Override
	abstract public String getBreed();

}

package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] theFortunes = {"Fortune 1", "Fortune 2", "Fortune 3"};
	
	@Override
	public String getFortune() {
	
		Random rand = new Random();

		// Obtain a number between [0 - 2].
		int index = rand.nextInt(theFortunes.length);

		return theFortunes[index];
	}

}

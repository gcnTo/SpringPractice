package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FootballRandomFortuneService implements FortuneService {

	String path = "C:\\Users\\Togrul\\eclipse-workspace\\spring-demo-annotations\\src\\footballFortunes.txt";
	String line = "";
	List<String> fortunes = new ArrayList<String>();
	
	// create a random number generator
	private Random rand = new Random();

	public FootballRandomFortuneService() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) != null) {
				fortunes.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String getFortune() {
		int index = rand.nextInt(fortunes.size());
		return fortunes.get(index);
	}

}
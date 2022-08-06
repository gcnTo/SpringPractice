package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		System.out.println("Inside the no-arg constructor of TrackCoach");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter for the fortuneService in the TrackCoach class");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: " + fortuneService.getFortune();
	}

	
	
	

}

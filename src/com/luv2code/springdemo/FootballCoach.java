package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 25 free kicks";
	}

	@Override
	public String getDailyFortune() {
		
		return "This is the way of life: " + fortuneService.getFortune();
	}

}

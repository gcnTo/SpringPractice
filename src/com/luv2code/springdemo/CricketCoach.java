package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private String emailAdress;
	private String team;
	
	
	private FortuneService fortuneService;
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside the no-arg constuctor");
	}
	
	
	public String getEmailAdress() {
		return emailAdress;
	}


	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside the setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

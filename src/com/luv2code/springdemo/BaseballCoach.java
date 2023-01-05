package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	
	// define a private field for the dependecy
	private FortuneService fortuneService;
	
	// define a constructor for dependecy injection
	private BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneservice to get a fortune
		return fortuneService.getFortune();
	}
}

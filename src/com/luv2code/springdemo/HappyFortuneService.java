package com.luv2code.springdemo;
import java.util.concurrent.ThreadLocalRandom;

public class HappyFortuneService implements FortuneService {
				
	public static String getRandomFortune() {
		String[] arr = {"Today is your lucky day!", "You'll win your next match!", "You'll be the MVP!"};
	    int randIdx = ThreadLocalRandom.current().nextInt(arr.length);
	    String randomFor = arr[randIdx];
	    return randomFor;
	}

		@Override
	public String getFortune() {
		return getRandomFortune();
	}
}


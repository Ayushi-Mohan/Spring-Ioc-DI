package com.ayushi;

public class BaseballCoach implements Coach {

    //defien a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on batting practice";
    }

    @Override
    public String getDailyFortune() {

        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}

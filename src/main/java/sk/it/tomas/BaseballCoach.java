package sk.it.tomas;

public class BaseballCoach implements Coach {


    //define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) { fortuneService = theFortuneService;
    }
    // so our class is ready to accept dependency injection
    @Override
    public String getDailyWorkout(){
        return "Run for 20 minutes told the Baseball Coach.";
    }
    @Override// helper class
    public String getDailyFortune() { // v jednoduchosti sme zavolali funkciu from HappyFortuneService
    // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
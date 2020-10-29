package sk.it.tomas;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Run for 20 minutes.";
    }
}
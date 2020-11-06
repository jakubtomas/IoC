package sk.it.tomas;

public class TrackCoach implements Coach { // implements Coach interface

    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5 kilometers .";
    }

    @Override
    public String getDailyFortune() {
        return "Just DO it " +fortuneService.getFortune()  ;
    }
}


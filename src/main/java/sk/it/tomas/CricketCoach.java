package sk.it.tomas;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;






    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach :inside stter method - SetFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println(" run Function setEmailAddress in  CricketJava");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("run Function setTeam in CricketJava");
        this.team = team;
    }
    public CricketCoach() {
        System.out.println("CricketCoach: inside no arg constructor ");
    }
    // 1 step create setter method in your class for injections

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes CricketCoach.java";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("function getDailyFortune In CricketCoach link fortuneService.getFortune()");
        return fortuneService.getFortune();
    }
}

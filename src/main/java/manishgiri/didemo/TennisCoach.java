package manishgiri.didemo;

public class TennisCoach implements Coach{
    private FortuneService fortuneService;


    public TennisCoach() {
        System.out.println("No arg constructor in tennis coach.");
    }
    // constructor injection
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Parameterized constructor in tennis coach.");
    }

    @Override
    public String getDailyWorkout() {
        return "Win 5 sets.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}

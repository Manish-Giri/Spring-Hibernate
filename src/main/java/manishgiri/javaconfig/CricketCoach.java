package manishgiri.javaconfig;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 2 hours batting in nets.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}

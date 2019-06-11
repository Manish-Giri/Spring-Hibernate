package manishgiri.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;


    public TennisCoach() {
        System.out.println("No arg constructor in tennis coach.");
    }
    // constructor injection using autowiring
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Parameterized constructor in tennis coach.");
    }

    @Override
    public String getDailyWorkout() {
        return "Win a game in 3 straight sets.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}

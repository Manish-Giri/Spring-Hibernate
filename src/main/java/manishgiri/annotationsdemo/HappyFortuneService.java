package manishgiri.annotationsdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "Tomorrow will be your lucky day.";
    }
}

package manishgiri.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigDemoApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SportConfig.class);


        CricketCoach coach = context.getBean("myCoach", CricketCoach.class);

        System.out.println(coach);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        context.close();
    }
}

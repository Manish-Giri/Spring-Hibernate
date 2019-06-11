package manishgiri.didemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("diApplicationContext.xml");

        Coach newCoach = context.getBean("myCoach", Coach.class);

        System.out.println(newCoach.getDailyWorkout());

        System.out.println(newCoach.getDailyFortune());

        context.close();

    }
}

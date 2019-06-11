package manishgiri.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("annotationsApplicationContext.xml");

        Coach newCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(newCoach.getDailyWorkout());

        System.out.println(newCoach.getDailyFortune());

        context.close();

    }
}

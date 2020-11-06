package sk.it.tomas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {


        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //FortuneService fortuneService =  context.getBean("myFortuneService", FortuneService.class);
        //System.out.println(fortuneService.getFortune());

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(" + " +theCoach.getDailyFortune());


        //close the context
        context.close();
    }
}

package manishgiri.hibernatetutorial.hibernate.demo;

import manishgiri.hibernatetutorial.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Student newStudent = new Student("John", "Doe", "john.doe@gmail.com");

            session.beginTransaction();

            System.out.println("Saving the student...");
            session.save(newStudent);

            // save more students
            session.save(new Student("Shane", "Warne", "shane.warne@gmail.com"));
            session.save(new Student("Ricky", "Ponting", "ricky.ponting@gmail.com"));

            // commit
            session.getTransaction().commit();

            System.out.println("Done...");

        }

        catch (Exception e) {
            System.out.println("Failed: " + e);
        }

        finally {
            session.close();
        }


    }
}

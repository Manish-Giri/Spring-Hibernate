package manishgiri.hibernatetutorial.hibernate.demo;

import manishgiri.hibernatetutorial.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Student newStudent = new Student("Oliver", "Twist", "oliver.twist@gmail.com");

            session.beginTransaction();

            System.out.println("Saving the student...");
            System.out.println(newStudent);
            session.save(newStudent);

            // commit
            session.getTransaction().commit();

            System.out.println("Done...");
            System.out.println("-----------");
            // retrieve saved student object
            int savedId = newStudent.getId();
            System.out.println("Saved student's Generated ID: " + savedId);

            // start session to retrieve student
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Getting student with id: " + savedId);
            Student savedStudent = session.get(Student.class, savedId);
            System.out.println("Save complete...");
            System.out.println(savedStudent);

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

/*

 OUTPUT -

 Jul 18, 2019 7:52:33 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {5.4.3.Final}
Jul 18, 2019 7:52:34 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
Jul 18, 2019 7:52:35 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)
Jul 18, 2019 7:52:35 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC]
Jul 18, 2019 7:52:35 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {password=****, user=hbstudent}
Jul 18, 2019 7:52:35 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
Jul 18, 2019 7:52:35 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH000115: Hibernate connection pool size: 1 (min=1)
Jul 18, 2019 7:52:36 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQLDialect
Inside Student no arg constructor...
Creating student object with given details...
Saving the student...
Student{id='0', firstName='Oliver', lastName='Twist', email='oliver.twist@gmail.com'}
Hibernate: insert into student (email, first_name, last_name) values (?, ?, ?)
Done...
-----------
Student getId() called...
Saved student's Generated ID: 5
Getting student with id: 5
Hibernate: select student0_.id as id1_0_0_, student0_.email as email2_0_0_, student0_.first_name as first_na3_0_0_, student0_.last_name as last_nam4_0_0_ from student student0_ where student0_.id=?
Inside Student no arg constructor...
Save complete...
Student{id='5', firstName='Oliver', lastName='Twist', email='oliver.twist@gmail.com'}
Done...

Process finished with exit code 0

 */
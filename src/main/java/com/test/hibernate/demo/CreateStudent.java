package com.test.hibernate.demo;


import com.test.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent
{
    public static void main(String[] args){
        //create session factory
        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Student.class)
                                    .buildSessionFactory();
        //create session
        Session session = factory.getCurrentSession();

        try {
            System.out.println("Creating new student object");
            Student student = new Student("Eugene", "Shaparenko", "gesha8610@gmail.com");

            session.beginTransaction();

            System.out.println("saving object");

            session.save(student);

            session.getTransaction().commit();
        }
        finally {
            session.close();
        }
    }
}

package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.config.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Busy", "R", "Marketing", 200);

            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            System.out.println(emp);
        } finally {
            factory.close();
        }
    }
}

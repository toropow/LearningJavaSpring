package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.config.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try{
//Example 1
//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Anton", 21);
//            Child child2 = new Child("Busy", 18);
//            Child child3 = new Child("Sergey", 25);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

// Example 2
//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("VolleyBall");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 28);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//
// Example3
//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

// Example 4

//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

// Example 5
//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 5);
//
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

// Example 5-1
            session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class, 3);

            session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!!!");


        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}

package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.config.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee employee = new Employee("Nikolay", "Denisov", "Account", 3500);
//            Detail detail = new Detail("London", "12345", "nikolay@lgs.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
            session.beginTransaction();
         //   session.save(detail);
            Detail detail = session.get(Detail.class, 6);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

        //    System.out.println(detail.getEmployee());

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}

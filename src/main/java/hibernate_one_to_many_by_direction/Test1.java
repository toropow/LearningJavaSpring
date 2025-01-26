package hibernate_one_to_many_by_direction;


import hibernate_one_to_many_by_direction.entity.Department;
import hibernate_one_to_many_by_direction.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.config.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
// Example 1
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department dep = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Anton", "T", 1000);
//            Employee emp2 = new Employee("Maxim", "Traktorov", 800);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            session.save(dep);

//            session.getTransaction().commit();
//            System.out.println("Done!");

// Example 2
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

// Example 3
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

// Example 4
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");


        } finally {
            session.close();
            factory.close();
        }
    }
}

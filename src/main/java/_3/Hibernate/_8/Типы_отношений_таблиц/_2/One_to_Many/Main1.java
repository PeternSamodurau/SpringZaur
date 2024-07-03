package _3.Hibernate._8.Типы_отношений_таблиц._2.One_to_Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee1.class)
                .addAnnotatedClass(Department1.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();

//            Department department = new Department("IT",300,100);                   //  добавляем
//            Employee employee1 = new Employee("Peter","Samadurov",800);
//            Employee employee2 = new Employee("Meter","kamadurov",500);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();
//          session.save(department);
            Department1 department = session.get(Department1.class,1);
            System.out.println(department);

            List<Employee1> employees = department.getEmployeeList();

            for (Employee1 employee : employees) {
                System.out.println(employee);
            }
            System.out.println("_______________________________________");

            Employee1 employee = session.get(Employee1.class,1);
            System.out.println(employee);
            System.out.println(employee.getDepartment());

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}

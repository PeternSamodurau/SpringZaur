package _3.Hibernate._5.Получение_объектов_из_BD;


import _3.Hibernate._4.Генерация_значений_для_столбца_PrimaryKey.Employee;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

@Log4j2
public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee1 = session.get(Employee.class, 1);

            System.out.println(employee1);

            List<Employee> employeeList = session.createQuery("from Employee", Employee.class).getResultList();
            List<Employee> employee2 = session.createQuery("from Employee" + " where name = 'Ivan' AND salary = 500", Employee.class).getResultList();

            session.getTransaction().commit();
            session.close();

            System.out.println(employeeList);
            System.out.println("_____________________________________________________________________");
            System.out.println(employee2);
            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}

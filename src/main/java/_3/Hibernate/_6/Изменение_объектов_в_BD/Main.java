package _3.Hibernate._6.Изменение_объектов_в_BD;

import _3.Hibernate._4.Генерация_значений_для_столбца_PrimaryKey.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 8);

            System.out.println(employee);
            employee.setSalary(1000);
            System.out.println(employee);

            session.createQuery("update Employee set salary = 1000 where name = 'Ivan'" ).executeUpdate();

            session.getTransaction().commit();
            session.close();
            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }
}

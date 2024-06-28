package _3.Hibernate._3.Сохранение_Java_объектов_BD;

import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Log4j2
public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Ivan", "Ivanov", "IT", 500);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            session.close();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}

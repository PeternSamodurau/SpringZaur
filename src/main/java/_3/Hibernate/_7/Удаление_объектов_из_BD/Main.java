package _3.Hibernate._7.Удаление_объектов_из_BD;

import _3.Hibernate._4.Генерация_значений_для_столбца_PrimaryKey.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 6);

            System.out.println(employee);
            session.delete(employee);
            System.out.println(employee);

            session.createQuery("delete from Employee where name = 'Ivan'").executeUpdate();

            session.getTransaction().commit();
            session.close();
            System.out.println("Done!");
        } finally {
            factory.close();
        }

    }
}

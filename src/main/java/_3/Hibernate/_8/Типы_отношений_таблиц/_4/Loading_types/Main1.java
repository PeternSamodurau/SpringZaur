package _3.Hibernate._8.Типы_отношений_таблиц._4.Loading_types;

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
            session.beginTransaction();

            Department1 department = session.get(Department1.class, 5);
            System.out.println(department);                                // с департаментом выводятся все работники т к связь двухсторонняя ,fetch = FetchType.EAGER по умолчанию

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}

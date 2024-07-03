package _3.Hibernate._8.Типы_отношений_таблиц._1.One_to_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main3 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee2.class)
                .addAnnotatedClass(DetailBiDirection.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee2 employee2 = new Employee2("Petr", "Petrov", "Sales", 1500);

            DetailBiDirection detail2 = new DetailBiDirection("Moscow", "123456", "a@b.com");

            employee2.setEmpDetail2(detail2);
            detail2.setEmp(employee2);

            DetailBiDirection detail3 = session.get(DetailBiDirection.class, 8);
            System.out.println(detail3);

            session.save(detail2);
            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}

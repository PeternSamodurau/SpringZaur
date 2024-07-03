package _3.Hibernate._8.Типы_отношений_таблиц._1.One_to_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee1.class)
                .addAnnotatedClass(DetailOneDirection.class)
                .buildSessionFactory();
        Session session = null;
        try {
            factory.getCurrentSession();
            session.beginTransaction();

            Employee1 employee = session.get(Employee1.class, 1);
            System.out.println(employee);
            System.out.println(employee.getEmpDetail());       // благодаря cascade = CascadeType.ALL можно получить объект detail

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
        context.close();
    }
}

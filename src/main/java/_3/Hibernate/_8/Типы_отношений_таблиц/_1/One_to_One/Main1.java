package _3.Hibernate._8.Типы_отношений_таблиц._1.One_to_One;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Employee1 employee = context.getBean("employee1", Employee1.class);
        DetailOneDirection detail = context.getBean("detailOneDirection", DetailOneDirection.class);

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee1.class)
                .addAnnotatedClass(DetailOneDirection.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            employee.setName("Ivan");
            employee.setSurname("Ivanov");
            employee.setDepartment("IT");
            employee.setSalary(500);

            detail.setCity("Krasnodar");
            detail.setPhoneNumber("123456");
            detail.setEmail("a@b.com");

            employee.setEmpDetail(detail);
           // session.save(employee);                      // чтобы много одинаковых не добавлялось в бд

            List<Employee1> employeeList = session.createQuery("from Employee1", Employee1.class).getResultList();
           employeeList.forEach(System.out::println);

            session.getTransaction().commit();
            session.close();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
        context.close();

    }
}

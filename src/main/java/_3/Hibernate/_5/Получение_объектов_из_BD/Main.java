package _3.Hibernate._5.Получение_объектов_из_BD;


import _2.AspectOrientedProgramming._2_Advice_type._6.Around.MyConfig;
import _3.Hibernate._4.Генерация_значений_для_столбца_PrimaryKey.Employee;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import static java.lang.System.out;

@Log4j2
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Employee employee = context.getBean("employee", Employee.class);
        out.println(employee);


        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee1 = session.get(Employee.class, 1);

            out.println(employee1);

            List<Employee> employeeList = session.createQuery("from Employee", Employee.class).getResultList();
            List<Employee> employee2 = session.createQuery("from Employee" + " where name = 'Ivan' AND salary = 500", Employee.class).getResultList();

            session.getTransaction().commit();
            session.close();

            out.println(employeeList);
            out.println("_____________________________________________________________________");
            out.println(employee2);
            out.println("Done!");

        } finally {
            factory.close();
        }

        context.close();
    }

}

package _3.Hibernate._4.Генерация_значений_для_столбца_PrimaryKey;


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
            System.out.println(employee); // значение id формируется в БД и передается в объект в поле id
        } finally {
            factory.close();
        }
    }
}

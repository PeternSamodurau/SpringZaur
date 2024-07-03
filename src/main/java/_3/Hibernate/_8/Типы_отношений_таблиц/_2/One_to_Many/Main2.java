package _3.Hibernate._8.Типы_отношений_таблиц._2.One_to_Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee2.class)
                .addAnnotatedClass(Department2.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Department2 department = new Department2("Sale",1300,2000);                   //  добавляем

            Employee2 employee1 = new Employee2("Oleg","Ivanov",800);
            Employee2 employee2 = new Employee2("Sergey","Sidorov",500);

            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);

            session.save(department);

            Department2 department2 = session.get(Department2.class,2);

            System.out.println(department2);
            System.out.println("_____________________________");
            System.out.println(department2.getEmployeeList());


            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}

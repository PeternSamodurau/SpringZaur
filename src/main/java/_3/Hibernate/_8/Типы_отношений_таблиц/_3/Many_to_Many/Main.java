package _3.Hibernate._8.Типы_отношений_таблиц._3.Many_to_Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();

            Section section1 = new Section("dance");
            Section section2 = new Section("chess");
            Section section3 = new Section("sky");

//            Child child1 = new Child("Peter", 53);
//            Child child2 = new Child("Alla", 50);
//            Child child3 = new Child("Sveta", 55);
            Child child4 = new Child("Kate", 25);


//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
              section1.addChildToSection(child4);
//            child4.addSectionToChild(section1);
//            child4.addSectionToChild(section2);
//            child4.addSectionToChild(section3);


            session.beginTransaction();
         //   Section section = session.get(Section.class,2);
            session.persist(section1);                                        // используем persist вместо save
        //      session.save(child4);
        //    session.delete(section);
            session.getTransaction().commit();
            System.out.println("Done!");
        }finally {
            session.close();
            sessionFactory.close();
        }
    }
}

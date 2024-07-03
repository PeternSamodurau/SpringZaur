package _3.Hibernate._8.Типы_отношений_таблиц._1.One_to_One;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component("employee2")
@Entity
@Table(name = "employees")
@Log4j2
@Getter
@Setter
@ToString
public class Employee2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "department")
    private String department;

    @Column(name = "salary")
    private int salary;

    @OneToOne(cascade = CascadeType.ALL) // относится к удалению - если удалить сотрудника, то удаляется и его детали, обязательно нужно указывать по дефолту нет
    @JoinColumn(name = "details_id")
    private DetailBiDirection empDetail2; // BiDirection empDetail;

    public Employee2() {
    }

    public Employee2(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }
}

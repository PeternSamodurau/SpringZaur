package _3.Hibernate._8.Типы_отношений_таблиц._2.One_to_Many;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
@Getter
@Setter
@ToString
public class Department2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String departmentName;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "min_salary")
    private int mixSalary;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private List<Employee2> employeeList;

    public Department2(){}

    public Department2(String departmentName, int maxSalary, int mixSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.mixSalary = mixSalary;
    }

    public void addEmployeeToDepartment(Employee2 employee){
        if (employeeList == null){
            employeeList = new ArrayList<>();

        }
        employeeList.add(employee);

    }

}


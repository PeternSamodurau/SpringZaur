package _3.Hibernate._8.Типы_отношений_таблиц._2.One_to_Many;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
@Getter
@Setter
public class Department1 {
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Employee1> employeeList;

    public Department1(){}

    public Department1(String departmentName, int maxSalary, int mixSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.mixSalary = mixSalary;
    }

    public void addEmployeeToDepartment(Employee1 employee){
        if (employeeList == null){
            employeeList = new ArrayList<>();

        }
        employeeList.add(employee);
        employee.setDepartment(this);
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", maxSalary=" + maxSalary +
                ", mixSalary=" + mixSalary +
                '}';
    }
}


package _3.Hibernate._8.Типы_отношений_таблиц._3.Many_to_Many;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "children")
@Getter
@Setter

public class Child {

    public Child() {}

    public Child(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "age")
    private int age;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH}) // все это чтобы не удалялось в привязке
    @JoinTable(name = "child_section",
              joinColumns = @JoinColumn(name = "child_id"),
              inverseJoinColumns = @JoinColumn(name = "section_id"))
    private Set<Section> sectionList;

    public void addSectionToChild(Section section){
        if (sectionList == null){
            sectionList = new HashSet<>();
        }
        sectionList.add(section);
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}

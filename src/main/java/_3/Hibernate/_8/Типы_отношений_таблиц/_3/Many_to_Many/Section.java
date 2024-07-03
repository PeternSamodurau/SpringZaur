package _3.Hibernate._8.Типы_отношений_таблиц._3.Many_to_Many;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity
@Table(name = "section")
@Getter
@Setter
public class Section {

    public Section() {}

    public Section(String name) {
          this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH}) // все это чтобы не удалялось в привязке
    @JoinTable(name = "child_section",
            joinColumns = @JoinColumn(name = "section_id"),
            inverseJoinColumns = @JoinColumn(name = "child_id"))
    private Set<Child> childList;

    public void addChildToSection(Child child){
        if (childList == null){
            childList = new HashSet<>();
        }
        childList.add(child);
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

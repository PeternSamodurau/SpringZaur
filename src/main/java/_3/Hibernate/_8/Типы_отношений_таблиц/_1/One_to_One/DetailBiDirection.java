package _3.Hibernate._8.Типы_отношений_таблиц._1.One_to_One;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "details")
@Getter
@Setter
@ToString
public class DetailBiDirection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "empDetail2", cascade = CascadeType.ALL) //ищи связь с Employee2 в поле empDetail...
    public Employee2 emp;              // BiDirection  добавили

    public DetailBiDirection() {
    }

    public DetailBiDirection(String city, String phoneNumber, String email) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}

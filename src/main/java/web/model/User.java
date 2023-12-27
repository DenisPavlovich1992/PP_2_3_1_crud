package web.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String email;

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
}
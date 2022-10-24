package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username", unique= true, nullable = false, length= 100)
    private String username;

    @Column(name="password", nullable = false, length= 100)
    private String password;

    @Column(name="name", nullable = false, length= 100)
    private String name;

    @Column(name="create_time", nullable = false)
    private LocalDateTime createTime;

    //role
    @Enumerated(EnumType.STRING)
    @Column(name="rol", nullable = false)
    private Role rol;

}

package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="title", nullable = false, length= 100)
    private String title;

    @Column(name="description", nullable = false, length= 100)
    private String description;

    @Column(name="author", nullable = false, length= 100)
    private String author;

    @Column(name="price", nullable = false, length= 100)
    private Double price;

    @Column(name="create_time", nullable = false)
    private LocalDateTime createTime;

}

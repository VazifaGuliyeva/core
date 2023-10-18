package az.kiraye.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity(name="categories")
@FieldDefaults( level= AccessLevel.PRIVATE)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer categoryId;
    @Column(name="categoryname")
    String CategoryName;

}

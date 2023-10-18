package az.kiraye.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name="favoriteItems")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FavoriteItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @OneToMany
    @JoinColumn(referencedColumnName = "homeId")
    List<Home> homes=new ArrayList<>();




}

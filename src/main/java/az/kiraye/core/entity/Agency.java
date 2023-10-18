package az.kiraye.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity(name="agencies")
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer agencyId;
    @Column(name="agencyname")
    String agencyName;

}

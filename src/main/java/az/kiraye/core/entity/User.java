package az.kiraye.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity(name="users")
@FieldDefaults( level= AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name="fullname")
    String fullName;

    @ManyToOne //?
    @JoinColumn(referencedColumnName = "roleId")
    Role role;

    @ManyToOne
    @JoinColumn(referencedColumnName = "agencyId")
    Agency agency;


}

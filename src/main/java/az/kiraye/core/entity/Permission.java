package az.kiraye.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity(name="permissions")
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer permissionId;
    @Column(name="permissionname")
    String permissionName; //delete,add and so on...

    @ManyToOne //?
    @JoinColumn(referencedColumnName = "roleId")
    Role role;



}
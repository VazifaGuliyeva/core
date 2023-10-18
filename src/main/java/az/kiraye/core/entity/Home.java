package az.kiraye.core.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity(name="homes")
@FieldDefaults( level= AccessLevel.PRIVATE)
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer homeId;
    @Column(name="area")
    double area;
    @Column(name="repair")
    boolean repair;
    @Column(name="floor")
    double floor; //?
    @Column(name="numberofroom")//?
    int numberOfRoom;
    @Column(name="description")
    String description; //?

    @ManyToOne
    @JoinColumn(referencedColumnName = "categoryId") //?
    private Category category;

    @ManyToOne
    @JoinColumn(referencedColumnName = "agencyId")
    Agency agency;

}

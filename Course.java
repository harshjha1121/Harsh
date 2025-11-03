import jakarta.persistence.*;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double fee;

    public Course() {}
    public Course(String name, double fee) { this.name = name; this.fee = fee; }

    // getters and setters
}

import jakarta.persistence.*;

@Entity
@Table(name = "Enrollment")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int studentId;
    private int courseId;

    public Enrollment() {}
    public Enrollment(int studentId, int courseId) {
        this.studentId = studentId; this.courseId = courseId;
    }

    // getters and setters
}

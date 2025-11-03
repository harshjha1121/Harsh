import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import java.util.List;

@Repository
public class StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Student s) { sessionFactory.getCurrentSession().save(s); }
    public void update(Student s) { sessionFactory.getCurrentSession().update(s); }
    public void delete(Student s) { sessionFactory.getCurrentSession().delete(s); }
    public Student getById(int id) { return sessionFactory.getCurrentSession().get(Student.class, id); }
    public List<Student> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Student", Student.class).list();
    }
}

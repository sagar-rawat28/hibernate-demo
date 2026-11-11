package in.coderarmy.hibernateDemo.repository;

import in.coderarmy.hibernateDemo.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    @PersistenceContext
    private EntityManager entityManager;

    //create
    public void save(Student student) {
        entityManager.persist(student);
    }

    //update-->No need to make method for update because we can do same things with the help of hibernate.
    //read
    public Student findById(Long id) {
        return entityManager.find(Student.class, id);
    }

    //delete
    public void remove(Student student ) {
        entityManager.remove(student);
    }

}

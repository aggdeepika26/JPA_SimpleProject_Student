package org.example.repository;

import org.example.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentRepository {
    private EntityManager entityManager;
    private EntityManagerFactory enf;

    public StudentRepository() {
        this.enf = Persistence.createEntityManagerFactory("student-pu");
        this.entityManager = this.enf.createEntityManager();
    }

    public StudentRepository(String pu) {
        this.enf = Persistence.createEntityManagerFactory(pu);
        this.entityManager = this.enf.createEntityManager();
    }

    public Student add(Student student) {
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        return student;
    }

    public Student find(Long id) {
        return entityManager.find(Student.class, id);
    }

    public Student update(Student student) {
        Student studentToUpdate = find(student.getId());
        entityManager.getTransaction().begin();
        studentToUpdate.setFirstName(student.getFirstName());
        studentToUpdate.setLastName(student.getLastName());
        entityManager.getTransaction().commit();
        return studentToUpdate;
    }

    public void delete(Student student) {

        entityManager.getTransaction().begin();
        entityManager.remove(student);
        entityManager.getTransaction().commit();

    }

}




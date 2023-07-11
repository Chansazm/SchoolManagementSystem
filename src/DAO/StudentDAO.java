package DAO;

import Model.Student;

import java.util.List;

// DAO (Data Access Object) interfaces
public interface StudentDAO {
    Student getById(int id);


    List<Student> getAll();
    void save(Student student);
    void delete(Student student);
}

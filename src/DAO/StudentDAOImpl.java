package DAO;

import Model.Student;

import java.util.ArrayList;
import java.util.List;

// DAO implementations
public class StudentDAOImpl implements StudentDAO {
    private List<Student> students = new ArrayList<>();

    @Override
    public Student getById(int id) {
        for (Student student : students) {
            if (student.getId() == (id)) {
                return student;
            }
        }
        return null;
    }



    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }
}

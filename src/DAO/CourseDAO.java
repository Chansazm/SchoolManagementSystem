package DAO;

import Model.Course;

import java.util.List;

public interface CourseDAO {
    Course getById(int id);
    List<Course> getAll();
    void save(Course course);
    void delete(Course course);
}

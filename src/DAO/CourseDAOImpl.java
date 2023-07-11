package DAO;

import Model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseDAOImpl implements CourseDAO {
    private List<Course> courses = new ArrayList<>();

    @Override
    public Course getById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }

    @Override
    public List<Course> getAll() {
        return courses;
    }

    @Override
    public void save(Course course) {
        courses.add(course);
    }

    @Override
    public void delete(Course course) {
        courses.remove(course);
    }
}

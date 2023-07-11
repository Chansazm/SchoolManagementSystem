package DAO;

import Model.Grade;

import java.util.List;

public interface GradeDAO {
    Grade getByStudentAndCourse(int studentId, int courseId);
    List<Grade> getAll();
    void save(Grade grade);
    void delete(Grade grade);
}

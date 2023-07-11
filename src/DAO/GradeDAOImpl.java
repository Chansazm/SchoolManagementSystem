package DAO;

import Model.Grade;

import java.util.ArrayList;
import java.util.List;

public class GradeDAOImpl implements GradeDAO {
    private List<Grade> grades = new ArrayList<>();

    @Override
    public Grade getByStudentAndCourse(int studentId, int courseId) {
        for (Grade grade : grades) {
            if (grade.getStudentId() == studentId && grade.getCourseId() == courseId) {
                return grade;
            }
        }
        return null;
    }

    @Override
    public List<Grade> getAll() {
        return grades;
    }

    @Override
    public void save(Grade grade) {
        grades.add(grade);
    }

    @Override
    public void delete(Grade grade) {
        grades.remove(grade);
    }
}


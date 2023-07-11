package Service;

import DAO.*;
import Model.Course;
import Model.Grade;
import Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Service class

public class SchoolManagementService {
    public static void main(String[] args) {
        // Instantiate sample students
        Student[] students = {
                new Student(1, "Sofia Hernandez", 18),
                new Student(2, "Alejandro Lopez", 19),
                new Student(3, "Isabella Chavez", 20),
                new Student(4, "Diego Rodriguez", 19),
                new Student(5, "Camila Torres", 18)
        };

        // Instantiate sample courses
        Course[] courses = {
                new Course(1, "Mathematics"),
                new Course(2, "English"),
                new Course(3, "Science"),
                new Course(4, "History"),
                new Course(5, "Art")
        };

        // Generate sample grades
        List<Grade> grades = generateSampleGrades(students, courses);

        // Print student information and grades
        System.out.println("Student Information:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grades:");
            for (Grade grade : grades) {
                if (grade.getStudentId() == student.getId()) {
                    System.out.println("Course: " + getCourseName(courses, grade.getCourseId()));
                    System.out.println("Grade: " + grade.getScore() + "%");
                }
            }
            System.out.println();
        }
    }

    public static List<Grade> generateSampleGrades(Student[] students, Course[] courses) {
        List<Grade> grades = new ArrayList<>();
        Random random = new Random();

        for (Student student : students) {
            for (Course course : courses) {
                int grade = random.nextInt(101);
                grades.add(new Grade(student.getId(), course.getId(), grade));
            }
        }

        return grades;
    }

    public static String getCourseName(Course[] courses, int courseId) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
                return course.getName();
            }
        }
        return "";
    }
}
package Model;

public class Grade {
    private int studentId;
    private int courseId;
    private double score;
    // Other grade attributes and methods

    @Override
    public String toString() {
        return "Grade{" +
                "studentId=" + studentId +
                ", courseId=" + courseId +
                ", score=" + score +
                '}';
    }

    // Constructors, getters, and setters

    public Grade(int studentId, int courseId, double score) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

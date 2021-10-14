package Entities;

public class Course extends Entity{

    private String name;
    private Teacher teacher;
    private double grade;

    public Course() {
    }

    public Course(final int id) {
        super(id);
    }

    public Course(final String name) {
        this.name = name;
    }

    public Course(final int id, final String name) {
        super(id);
        this.name = name;
    }

    public void setTeacher(final Teacher value) {
        this.teacher = value;
    }

    public void getTeacher() {
        return this.teacher;
    }

    public void setName(final String value) {
        this.name = value;
    }

    public void getName() {
        return this.name;
    }

    public void setGrade(final double value) {
        this.grade = value;
    }

    public void getGrade() {
        return this.grade;
    }

}

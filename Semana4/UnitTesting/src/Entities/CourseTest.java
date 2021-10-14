package Entities;

import org.junit.Test;

import Entities.Course;
import Entities.Teacher;
import jdk.jfr.Timestamp;

import static org.junit.Assert.assertEquals;

public class CourseTest {

@Test
public void testeCourseConstructorId(){
    Course course = new Course(123);
    assertEquals(course.getId(), 123);
}
@Test
public void testeCourseConstructorName(){
    Course course = new Course("Progra II");
    assertEquals(course.getName(), "Progra II");
}
@Test
public void testeCourseConstructorIdName(){
    Course course = new Course(123,"Programming II");
    assertEquals(course.getId(), 123);
    assertEquals(course.getName(), "Programming II");
}
@Test
public void testeTeacherSetter(){
    Teacher teacher = new Teacher();
    teacher.setFirstName("Jonh");
    Course course = new Course(1, "Programming");
    course.setTeacher(teacher);
    assertEquals(course.getTeacher().getFistName(), "Programming II");
}


}

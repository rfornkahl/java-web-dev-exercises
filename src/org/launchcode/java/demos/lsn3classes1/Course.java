package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Course {


    private String subject;
    private String teacher;
    private ArrayList<Student> students;

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", teacher='" + teacher + '\'' +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(subject, course.subject) && Objects.equals(teacher, course.teacher) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, teacher, students);
    }
}

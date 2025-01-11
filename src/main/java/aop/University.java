package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        Student st1 = new Student("Anton T", 5, 4.7);
        Student st2 = new Student("Mikhail Ivanov", 3, 3.7);
        Student st3 = new Student("Denis Astmavhov", 1, 3.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents");
        System.out.println(students);
        return students;
    }
}

package day2.Homework;
/**
 * @author Mustafa KANLI
 */

public class Student { // for this homework I don't create student manager
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void addCourse(Course course){
        System.out.println(course.name + " was added to "+ this.name +"'s courses");
    }
}

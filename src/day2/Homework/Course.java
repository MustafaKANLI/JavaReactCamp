package day2.Homework;
/**
 * @author Mustafa KANLI
 */

public class Course {
    public int id;
    public String name;
    public int capacity;

    public Course(){
        System.out.println("Course is created");
    }
    public Course(int id, String name, int capacity){
        this();
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }
}

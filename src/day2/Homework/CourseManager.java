package day2.Homework;
/**
 * @author Mustafa KANLI
 */

public class CourseManager {

    public CourseManager(){
        System.out.println("Course manager was created");
    }


    public void increaseCapacity(Course course, int newCapacity){
        course.capacity = newCapacity;
        System.out.println(course.name + "'s new capacity is: " + course.capacity);
    }
}

package day2.Homework;
/**
 * @author Mustafa KANLI
 */

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course(1,"Linear Algebra", 250);
        Course course2 = new Course(2, "Web Programming", 50);

        CourseManager courseManager = new CourseManager();


        Student student1 = new Student(123, "Mustafa KANLI");
        student1.addCourse(course1);
        student1.addCourse(course2);

        Course[] courses ={course1,course2};

        for (Course course: courses) {
            System.out.println(course.id + " " + course.name + " " + course.capacity);
        }
        courseManager.increaseCapacity(course1, 300);

    }


}

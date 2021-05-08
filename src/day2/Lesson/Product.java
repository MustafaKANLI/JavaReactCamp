package day2.Lesson;

public class Product {
    int id;
    String name;
    double unitPrice;
    String detail;

    public Product(){
        //System.out.println("I'm working");
    }

    public Product(int id, String name, double unitPrice, String detail){ //Overloading
        this(); //run the empty constructor
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }

}

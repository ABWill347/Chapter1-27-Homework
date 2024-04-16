package Homework;

public class Polymorphism extends Example{//26
    public Polymorphism(String occupation, double salary, double hours) {
        super(occupation, salary, hours);
    }

    @Override
    public void poly() {//26
        System.out.println("This is an example of polymorphism");
    }
    public void tax(){
        System.out.println("This is another example casting  ");
    }
}

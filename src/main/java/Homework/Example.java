package Homework;//10

public class Example extends Inheritance  implements InterfaceExample {//11
    private String occupation;
    private double salary;
    protected double hours;//25
    private final int daysWorked = 5;
    public static String info1;
    void workDays(){
        System.out.println("You worked "+daysWorked +" days");//12
    }double totalPay(){//13
        double totalPay=salary*hours;
        return totalPay ;
    }String getOccupation(){//14
        return occupation;
    }double getSalary() {//15
        return salary;
    }public void days(int daysWorked){//16
        if (daysWorked>=0){
            System.out.println(daysWorked);
        }
    }public void setOccupation(String occupation) {//17
        this.occupation = occupation;
    }public void setSalary(double salary) {
        this.salary = salary;
    }public void setHours(double hours) {
        this.hours = hours;
    } public Example(String occupation,double salary,double hours){//18
    this.occupation=occupation;
    this.salary=salary;
    this.hours=hours;

    }public static void info(){//19
        System.out.println(info1);
    }
    public String toString(){//21
        return occupation+info1;
    }

    @Override
    public void outputExtends() {
        System.out.println("Using the override method to show this output");

    }

    @Override
    public void interEx() {
        System.out.println("This in the implementation of interface");
    }
    public void poly(){
        System.out.println("This is an example of polymorphism");
    }
}

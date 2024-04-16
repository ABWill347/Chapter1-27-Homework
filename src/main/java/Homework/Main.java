package Homework;
import NewPackage.NewClass;//24

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Going back to the basics");//1
        int a =0; short b =1; long c = 2L; float d =3.0F;
        double e=4.0; char f='A'; boolean g=false; byte h= 5;//2
        System.out.println("Int "+a+" Short "+b+" Long "+c+" Float "+d+" Double "+ e+" Char "+f+" Boolean "+g+" Byte "+h);
        String lets="Commited";
        String get=" to ";
        String serious="Excellence";
        String itsTime=lets+get+serious;
        System.out.println(itsTime);
        while (a<2){//3
            System.out.println("This is a while loop "+a);
            a++;
        }
        for (int i=0;i<=b;i++){
            System.out.printf("This is a for loop %d \n",i);
        }int number =5;//4
        if (number>15){
            System.out.println("It is grater");
        }else if (number<20){
            System.out.println("It is less then");
        }else {
            System.out.println("Try another number");
        }
        Scanner input=new Scanner(System.in);//5
        System.out.println("Enter number");
        double number1 = input.nextDouble();
        System.out.println("Enter another number");
        double number2= input.nextDouble();
        System.out.println("Enter operation-- 1 Addition, 2 Subtraction, 3 Multiplication, 4 Division");
        int operation = input.nextInt();
        if (operation==1) {
            System.out.println("The total is "+(number1 + number2));
        } else if (operation==2) {
            System.out.println("The total is "+(number1-number2));
        } else if (operation==3) {
            System.out.println("The total is "+(number1*number2));
        }else {
            System.out.println("The total is " + (number1 / number2));
        }int answer =input.nextInt();
        input.nextLine();
        do {
            System.out.println("Enter a number");//6
            input.nextLine();
        }
        while (answer>10);
        System.out.println("You did it ");

        System.out.println("Please enter another command");//7
        String command = input.nextLine();
        switch (command){
            case "run":
                System.out.println("Speed up");
                break;
            case "Walk":
                System.out.println("Slow down");
                break;
            case "Crawl":
                System.out.println("Get off the floor ");
                break;
            default:
                System.out.println("Get ready");
            break;
        }

        int [] value ={1,2,3,4,5};//8
        for (int l=0;l<value.length;l++){
            System.out.print(value[l]+" ");
        }System.out.print('\n');
        String[] Name= {"Tom","Jerry","Larry","Moe"};
        for (int i =0;i<Name.length;i++){
            System.out.print(Name[i]+" ");
        }System.out.println(Name[1]);
        
        int [] [] multiDimensionalArrays={//9
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };System.out.println(multiDimensionalArrays[1][2]);
        for (int row=0;row <multiDimensionalArrays.length; row++){
            for (int col =0;col<multiDimensionalArrays[row].length;col++){
                System.out.print(multiDimensionalArrays[row][col]+" ");
            }
        }
        System.out.println(" ");
        Example example=new Example("Pilot",50,40);
        example.setHours(40);
        example.setOccupation("Pilot");
        example.setSalary(50);
        example.workDays();
        String workType= example.getOccupation();
        double salary=example.getSalary();
        System.out.println("Your occupation is "+workType);
        System.out.println("Your hourly wage  is $"+salary);
        System.out.println( "The total salary after working is $"+example.totalPay());
        example.days(5);
        Example.info1="New Static";
        Example.info();
        StringBuilder stringBuilder=new StringBuilder();//20
        stringBuilder.append("Im ");
        stringBuilder.append("Trying something ");
        stringBuilder.append("new");
        System.out.println(stringBuilder);
        //System.out.println(example);
        Example example1=new Example("Dog walker",15,50);
        example.outputExtends();
        example.interEx();
        NewClass newClass=new NewClass();
        newClass.outputExtends();
       Example exl=new Polymorphism("Florist",10,30);
       exl.poly();
       ((Polymorphism) exl).tax();








    }//PSVM



}//Main

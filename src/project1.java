import java.util.Scanner;

public class project1 {


    public static void main(String[]args){
        /*
        * write a java program that allow the user
        * to enter his weight and height ,and display
        * the body mass index for this user
        * the formula is BMI =kg/m2 where kg is a person's
        * weight in kilograms and m2 is their height
        * in meters squared
        * */


        //create variables
        float weight;
        float height;

        System.out.println("please enter your weight:");
        Scanner reader = new Scanner(System.in);
        weight=reader.nextFloat();

        System.out.println("please enter your height:");
        Scanner reader1 = new Scanner(System.in);
        height = reader1.nextFloat();

        float bmi =weight/(height*height);





        System.out.println("BMI = "+ bmi);

    }

}

import java.util.Scanner;

public class conditional {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        
        checkpositivenegative(n);
        checkvoteeleigibity();
        CheckBiggest();
        

    }
    public static void checkpositivenegative(int n){
        if(n>0){
            System.out.println("The number is positive");
        } else if(n<0){
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
    public static void checkvoteeleigibity(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc1.nextInt();
        if(age>=18){
            System.out.println("You are eligible");
        }else{
            System.out.println("you are not eligible");
        }
        

    }
    public static void CheckBiggest()
    {
        Scanner sc2=new Scanner(System.in);
        System.out.println("enter your first number:");
        int firstnum=sc2.nextInt();
        System.out.println("enter yor second num:");
        int secnum=sc2.nextInt();
        if(firstnum>secnum){
            System.out.println("first is big");

        }
        else{
            System.out.println("second is big");
        }
        

    }
    
}

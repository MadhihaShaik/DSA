import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the first number:");
        float number1=num1.nextFloat();
        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the second number");
        float number2= num2.nextFloat();
        if(number1<number2){
            System.out.println("The largest number is: "+number2);
         }
         else{
            System.out.println("The largest number is: "+number2);
         }
         num1.close();
         num2.close();
    }
    
}

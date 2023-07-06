import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = input1.nextFloat();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        float num2 = input2.nextFloat();
        float add = num1 + num2;
        float mul = num1 *num2;
        float divide= num1/num2;
        float sub;
        System.out.println("Sum:"+add);
        if(num1>num2){
            sub = num1 - num2;
        }
        else{
             sub = num2 -num1;
        }
        System.out.println("Sub:"+sub);
        System.out.println("Multiply:"+mul);
        System.out.println("Divide:"+divide);
        input1.close();
        input2.close();
    }
}

package conditionalsandloops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int factorial= 1;
        for (int i =1;i<=num;i++){
            factorial*=i;
        }
        System.out.println(factorial);
        in.close();
    }
}

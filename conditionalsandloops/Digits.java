package conditionalsandloops;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = in.nextInt();
        int ans = 1;
        int sum =0;
        while(a>0){
          int rem = a%10;
          ans = ans *rem;
          sum = sum + rem;
          a = a/10;
        }
        System.out.println("product:"+ans);
        System.out.println("Sum: "+sum);
        in.close();
    }
}

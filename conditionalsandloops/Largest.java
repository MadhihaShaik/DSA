package conditionalsandloops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("if you want to end the loop Enter 0.");
        System.out.print("Enter the numbers to find the largest of all:");
        int num;
        int ans = 0;
       do {
            Scanner in = new Scanner(System.in);
            num= in.nextInt();
            if(num>ans){
                ans= num;
            }
        }while(num>0);
        System.out.println("The largest value is: "+ans);
    }
}

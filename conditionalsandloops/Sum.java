package conditionalsandloops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("if you want to end the loop Enter 0.");
        System.out.print("Enter the numbers to be added:");
        int num;
        int ans = 0;
       do {
            Scanner in = new Scanner(System.in);
            num= in.nextInt();
            ans = ans+num;
        }while(num>0);
        System.out.println(ans);
    }
}

import java.util.Scanner;

public class Countnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        Scanner occurence = new Scanner(System.in);
        System.out.print("Enter the number that need to be counted:");
        int occur = occurence.nextInt();
        int count= 0;
        while(num>0){
            int rem = num%10;
            if(rem==occur){
                count++;
            }
            num= num/10;
        }
        System.out.println(count);
        in.close();
        occurence.close();
    }
}

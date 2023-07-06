import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        input.close();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}

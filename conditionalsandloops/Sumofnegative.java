package conditionalsandloops;

import java.util.Scanner;

public class Sumofnegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 to end the loop!");
        System.out.println("Enter the numbers: ");
        int num;
        int negative = 0 ;
        int evenpositive =0;
        int oddpositive = 0;
        do{
            num = in.nextInt();
            if(num<0){
                negative = negative+num;
            }
            else{
                if(num%2==0){
                    evenpositive=evenpositive+num;
                }
                else{
                    oddpositive=oddpositive+num;
                }
            }
        }while(num!=0);
        System.out.println("Sum of negative numbers: "+negative);
        System.out.println("Sum of positive even numbers: "+evenpositive);
        System.out.println("Sum of odd positive numbers: "+oddpositive);
        in.close();
    }
}

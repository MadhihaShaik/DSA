package conditionalsandloops;

import java.util.Scanner;

public class Evendays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = in.nextInt();
        switch(month){
            case 1,3,5,7,8,10,12:
            System.out.println(31);
            break;
            case 2,4,6,9,11:
            System.out.println(30);     
            break; 
        }
        in.close();
    }
}

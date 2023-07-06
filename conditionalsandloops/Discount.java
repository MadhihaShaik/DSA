package conditionalsandloops;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        float price = in.nextFloat();
        System.out.print("Enter the dicount percentage: ");
        float percentage = in.nextFloat();
        float discount = 0;
        float result =0;
        if(price>0){
            discount = price -(price * (percentage/100));
            result = price - discount;

        }
        System.out.print("Dicount amount: "+result);
        in.close();
    }
}

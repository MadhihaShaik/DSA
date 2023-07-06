package conditionalsandloops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float input = in.nextFloat();
        float result =0;
        for(float i=0;i<=input;i++){
            result = result+i;
        }
        System.out.print("Average: "+result/input);
        in.close();
    }
}

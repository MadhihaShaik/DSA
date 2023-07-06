package conditionalsandloops;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the units consumed: ");
        float num = in.nextFloat();
        float result;
        float sum2 = 100*2.25f;
        float sum3 = 200*4.50f;
        float sum4 = 100*6.00f;
        float sum5 = 400*4.50f;
        float sum6 = 100*8.00f;
        float sum7 = 200*9.00f;
        float sum8 = 200*10.00f;
        if(num<=100){
            System.out.print("Amount: 0");
        }
        else if(num<=200){
            float sum = num -100;
            result = sum*2.25f;
            System.out.println("Amount: "+result);
        }
        else if(num<=400){
            float sum1= num -200;
            result= sum2+ (sum1*4.50f);
            System.out.println("Amount: "+result);
        }
        else if( num<=500){
            float sum1= num - 400;
            result = sum2+sum3+(sum1*6.00f);
            System.out.println("Amount: "+result);
        }
        else if(num<=600){
            float sum1 = num-500;
            result = sum5+sum4+(sum1*8.00f)-450;
            System.out.println("Amount: "+result);
        }
        else if(num<=800){
            float sum1= num-600;
            result = sum4+sum5+sum6+(sum1*9.00f)-450;
            System.out.println("Amount: "+result);
        }
        else if(num<=1000){
            float sum1=num-800;
            result = sum4+sum5+sum6+sum7+(sum1*10.00f)-450;
            System.out.println("Amount: "+result);
        }
        else if(num<10000){
            float sum1 = num-1000;
            result= sum4+sum5+sum6+sum7+sum8+(sum1*11.00f)-450;
            System.out.println("Amount: "+result);
        }
        else{
            System.out.println("please enter a valid number!");
        }
        in.close();
    }
}

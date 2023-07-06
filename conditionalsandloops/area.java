package conditionalsandloops;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:");
        float radius = in.nextFloat();
        float pi = 3.14f;
        if(radius>0){
            float area= pi*radius*radius;
            System.out.println(area);
        }
        else{
            System.out.println("please enter a valid radius");
        }
        in.close();
    }
}

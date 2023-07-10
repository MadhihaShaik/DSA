package Methods;
import java.util.*;
public class Minmax {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = in.nextInt();
    System.out.print("Enter the second number: ");
    int b = in.nextInt();
    System.out.print("Enter the third number: ");
    int c = in.nextInt();
    Min(a,b,c);
    Max(a,b,c);
    in.close();
    }
static void Min(int a ,int b,int c){
    if ((a<b)&&(a<c)){
        System.out.println("The min num is :"+a);
    }
    else{
        if(b<c){
            System.out.println("The min num is :"+b);
        }
        else{
            System.out.println("The min num is :"+c);

        }
    }
    }
    static void Max(int a, int b, int c){
          if ((a>b)&&(a>c)){
        System.out.println("The max num is :"+a);
    }
    else{
        if(b>c){
            System.out.println("The max num is :"+b);
        }
        else{
            System.out.println("The max num is :"+c);

        }
    }
    }
}


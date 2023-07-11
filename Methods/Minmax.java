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
    int min = Min(a,b,c);
    int max =Max(a,b,c);
    System.out.println("The min num is :"+min);
    System.out.println("The max num is: "+max);
    in.close();
    }
static int Min(int a ,int b,int c){
    int max = a;
    if (b>max){
        max = b;
    }
    if(c>max){
        max =c;
    }
    return max;
    }
    static int Max(int a, int b, int c){
       int min = a;
          if (b<min){
            min = b;
              }
    if(c<min){
        min = c;
    }
    return min;
    }
}


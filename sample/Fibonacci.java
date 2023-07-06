import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a,b,c,n;
        a=0;
        b=1;
        c=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the nth term of the fibonacci series: ");
        n = in.nextInt();
        while(c<=n){
            System.out.print(c+" ");
            a= b;
            b=c;
            c= a+b;
        }
        in.close();
    }
}

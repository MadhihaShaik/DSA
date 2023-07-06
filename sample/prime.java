import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    
        System.out.print("Enter the number- ");  
        int n= sc.nextInt();
        int c=2;  
        if(n<=1){
            System.out.println("neither nor");
        }
        while(c*c<=n){
            if(n%c==0){
                System.out.println("not prime");
                System.exit(0);
            }
            c+=1;
            break;
        }
        System.out.println("prime");
        sc.close();
    }
}

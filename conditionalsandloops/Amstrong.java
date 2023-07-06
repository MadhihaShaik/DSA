package conditionalsandloops;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int num= in.nextInt();
        // isAmstrong(num);
        // System.out.println(isAmstrong(num));
        for(int i=100;i<1000;i++){
            if(isAmstrong(i)){
                System.out.print(i+" ");
            }
        }

    }
    static boolean isAmstrong(int n){
        int original = n;
        int Amstrong = 0;
        while(n >0){
            int rem = n%10;
            n = n/10;
            Amstrong = Amstrong+ rem *rem *rem;
        }
        return (Amstrong== original);
    }
}

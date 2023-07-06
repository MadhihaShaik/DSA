// import java.util.Scanner;

// public class Reverse {
//     public static void main(String[] args) {
//         Scanner in= new Scanner(System.in);
//         System.out.print("Enter the number to be reversed:");
//         int num=in.nextInt();
//         while(num>0){
//             int rem=num%10;
//             System.out.print(rem);
//             num= num/10;
//         }
//         in.close();
//     }
// }

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number to be reversed:");
        int num=in.nextInt();
        int ans = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            ans= (ans * 10 ) + rem;
        }
        System.out.print(ans);
        in.close();
    }
}


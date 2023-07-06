import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner principle = new Scanner(System.in);
        System.out.print("Enter the principle:");
        double prin = principle.nextDouble();
        Scanner rate = new Scanner(System.in);
        System.out.print("Enter the rate:");
        double userrate = rate.nextDouble();
        Scanner time = new Scanner(System.in);
        System.out.print("Enter the time:");
        double usertime = time.nextDouble();
        double simpleinterest = prin*(1+((userrate/100)*usertime));
        System.out.print("The simple interest is: "+simpleinterest);
        principle.close();
        rate.close();
        time.close();
    }
}

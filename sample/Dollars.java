import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        float rupees = in.nextFloat()* 0.012f;
        System.out.println("The amount in dollars: "+rupees);
        in.close();
    }
}

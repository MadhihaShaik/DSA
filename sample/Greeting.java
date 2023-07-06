import java.util.Scanner;

public class Greeting{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.nextLine();
        in.close();
        System.out.println("Hello "+name);
    }
}

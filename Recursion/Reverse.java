public class Reverse {
    public static void main(String[] args) {
        System.out.print(rev(567337));
    }

    public static int rev(int n) {
        if (n % 10 == n) {
            return n;
        }
        System.out.print(n % 10);
        return rev(n / 10);
    }
}

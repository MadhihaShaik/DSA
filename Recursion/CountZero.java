public class CountZero {
    public static void main(String[] args) {
        System.out.println(zero(1050770));
    }

    public static int zero(int n) {
        return zeroCount(n, 0);
    }

    public static int zeroCount(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        if (n % 10 == 0) {
            return zeroCount(n / 10, sum + 1);
        }
        return zeroCount(n / 10, sum);

    }
}

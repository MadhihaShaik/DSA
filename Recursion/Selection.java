import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 4, 9, 2, 1 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        sort(arr, 0, arr.length - 1, 0);
    }

    static void sort(int[] arr, int s, int e, int max) {
        if (e == 0) {
            return;
        }
        if (s <= e) {
            if (arr[s] > arr[max]) {
                sort(arr, s + 1, e, s);
            } else {
                sort(arr, s + 1, e, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[e];
            arr[e] = temp;
            sort(arr, 0, e - 1, 0);
        }
    }
}

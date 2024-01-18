package Arrays;

import java.util.Arrays;

public class Maxval {
    public static void main(String[] args) {
        int[] arr = { 89, 45, 78, 85, 123};
        // System.out.println(max(arr));
        // System.out.println(maxrange(arr, 0, 3));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start= 0;
        int end = arr.length -1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]=temp;
    }

    //   static int maxrange(int[] arr, int start, int end) {
    //        int maxval = arr[0];
    //     for(int i=start;i<end;i++){
    //         if(arr[i]>maxval){
    //             maxval=arr[i];
    //         }
    //     }
    //     return maxval;
    // }

    // static int max(int[] arr) {
    //     int maxval = arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]>maxval){
    //             maxval=arr[i];
    //         }
    //     }
    //     return maxval;
    // }

}

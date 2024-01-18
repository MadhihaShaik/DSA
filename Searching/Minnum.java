package Searching;

public class Minnum {
    public static void main(String[] args) {
        int[] arr ={12,4,7,-6,-566,23};
        System.out.println(minimun(arr));
    }
    static int minimun(int[] arr){
        int min =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}

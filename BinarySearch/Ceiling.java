public class Ceiling
{
    public static void main(String[] args) {
        //search for the number 5 and return the array index
        int[] arr={2,4,5,7,8,12,25};
        System.out.println(binary(6,arr));
    }
    static int binary(int target,int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
        int mid = start+(end-start)/2;
        if(target<arr[mid]){
            end = mid -1;
        }
        else if(target>arr[mid]){
            start = mid+1;
        }
        else 
        {
            return mid;
        }
    }
     return start;
    }
}
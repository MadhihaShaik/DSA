public class Floor
{
    public static void main(String[] args) {
        //search for the number 5 and return the array index
        int[] arr={2,4,5,7,8,12,25};
        System.out.println(binary(5,arr));
    }
    static int binary(int target,int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
        int mid = start+(end-start/2);
        if(arr[mid]<target){
            start= mid+1;
        }
        else if(arr[mid]>target){
            end= mid-1;
        }
        else 
        {
            return mid-1;
        }
    }
     return end;
    }
}

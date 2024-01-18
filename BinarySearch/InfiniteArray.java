public class InfiniteArray {
    public static void main(String[] args){
        int[] arr= {1,3,5,6,7,8,9,14,16,18,20,23,26,30,34,37,39};
        int target = 6;
        System.out.println(ans(arr, target));
    }
    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end +1;
            end = end +(end-start+1)*2;
            start = temp;
        }
        return searchRange(arr, target, start, end);
    }
    public static int searchRange(int[] arr, int target,int start,int end){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        } 
        return -1;
    }
}

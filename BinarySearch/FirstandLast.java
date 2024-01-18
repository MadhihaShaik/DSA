public class FirstandLast {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = {-1,-1};
        int start = searchRange(nums,target,true);
        int end  = searchRange(nums,target,false);
        result[0]=start;
        result[1] = end;
        System.out.println(result);
    }
    public static int searchRange(int[] nums, int target,boolean findStart) {
        int ans = -1;
        int start = 0; 
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<nums[mid]){
                end = mid -1;
            }
            else if(target>nums[mid]){
                start = mid +1;
            }
            else{
                ans= mid;
                if(findStart==true){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}

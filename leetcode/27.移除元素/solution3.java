public class solution3 {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}

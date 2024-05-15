public class solution2 {
        public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[k]){
                k=k+1;
                nums[k]=nums[i];
            }
        }
        return k+1;


    }
}

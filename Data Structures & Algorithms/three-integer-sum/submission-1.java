class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0;i<nums.length-2 && nums[i]<=0;i++){
            if(i==0||nums[i]!=nums[i-1])
            twoSum(nums,i,result);
        }
        return result;
    }

    public void twoSum(int[] nums, int i ,List< List<Integer>> result){
       int left=i+1;
       int right=nums.length-1;

       while(left<right){
        if(nums[i]+nums[left]+nums[right]>0)
        right--;
        else if (nums[i]+nums[left]+nums[right]<0)
        left++;
        else
       {
       result.add(Arrays.asList(nums[i],nums[left++],nums[right--]));
        while(left<right && nums[left]==nums[left-1])
        ++left;
        while(left<right && nums[right]==nums[right+1])
        --right;
       }
       }

    }
}

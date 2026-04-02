class Solution {
    public int[] productExceptSelf(int[] nums) {
           int n = nums.length;
          int ans[] = new int[nums.length];

          int prefix[]=new int[nums.length+1];
          int postfix[]=new int[nums.length+1];
          prefix[0]=nums[0]; postfix[n-1]=nums[n-1];
        
        for(int i=1;i<n;i++)
         prefix[i]=prefix[i-1]*nums[i];
         for(int i=n-2;i>=0;i--)
         postfix[i]=postfix[i+1]*nums[i];
         System.out.println(Arrays.toString(prefix));
         System.out.println(Arrays.toString(postfix));
   ans[0]=postfix[1];
   ans[n-1]=prefix[n-2];
           for(int i=1;i<n-1;i++){
            ans[i]=prefix[i-1]*postfix[i+1];
           }

        return ans;
    }
}  

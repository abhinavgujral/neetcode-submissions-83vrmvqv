class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int[] leftGreatest= new int[n];
        int[] rightGreatest= new int[n];
        int leftMax=-1,rightMax=-1;
        for(int i=0;i<n;i++){
            leftMax=Math.max(leftMax,height[i]);
            leftGreatest[i]=leftMax;

            rightMax=Math.max(rightMax,height[n-1-i]);
            rightGreatest[n-1-i]=rightMax;
        }
System.out.println(leftGreatest.toString());
System.out.println(rightGreatest.toString());
   int water=0;
        for(int i=0;i<n;i++){
             water+= Math.min(leftGreatest[i],rightGreatest[i])-height[i];
        }
        return water;
    }
}

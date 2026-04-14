class Solution {
    public int characterReplacement(String s, int k) {
       int right=0,left=0,ans=0,maxOccurence=0,currLength=0;
       int[] CharOccurence= new int[26];
       for(right=0;right < s.length();right++){
           currLength=right-left+1;
           maxOccurence=Math.max(maxOccurence,++CharOccurence[s.charAt(right)-'A']);
           if(currLength-maxOccurence>k){
            --CharOccurence[s.charAt(left)-'A'];
            left++;
           }
           else{
            ans=Math.max(ans,(right-left+1));
           }
       }
        return ans;
    }
}

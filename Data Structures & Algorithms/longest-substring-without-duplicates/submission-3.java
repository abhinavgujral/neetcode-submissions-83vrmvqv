class Solution {
    public int lengthOfLongestSubstring(String s) {
   

   StringBuilder currString= new StringBuilder();
   int maxLength=0;
   
   for(int i=0;i<s.length();i++){
   char ch =s.charAt(i);
   if(currString.indexOf(String.valueOf(ch))!=-1){
    currString.delete(0,currString.indexOf(String.valueOf(ch))+1);
      
   }
    currString.append(ch);
   
    maxLength=Math.max(maxLength,currString.length());


   }
  return maxLength;
    }
    
}

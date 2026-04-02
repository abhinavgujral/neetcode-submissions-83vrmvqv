class Solution {
    public boolean isPalindrome(String s) {
         
          String str = s.replaceAll("[^a-zA-Z0-9]", "");
         str=str.replaceAll(" ", "");
         int start=0, end=str.length()-1;
      System.out.println(str);
       while(start<end){


      if(Character.toLowerCase(str.charAt(start))!=Character.toLowerCase(str.charAt(end)))
      {
        System.out.println(Character.toLowerCase(str.charAt(start)));
        System.out.println(Character.toLowerCase(str.charAt(end)));
        return false;

      }
        start++;
        end--;

       } 
       return true;
    }
}

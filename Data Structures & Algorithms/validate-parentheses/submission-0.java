class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
         char currCh;
         for( int i=0;i<s.length();i++){
         currCh=s.charAt(i);
         
         if(currCh=='['||currCh=='{'||currCh=='(')
           st.push(s.charAt(i));
           else{
            if(st.isEmpty()) return false;
             if((st.peek()=='['&& currCh==']')
              || (st.peek()=='{'&& currCh=='}')  
               || (st.peek()=='('&& currCh==')') )
                {st.pop();
                }else{
                  return false;
                }
            }
         
         }
         return st.isEmpty();
    }
}

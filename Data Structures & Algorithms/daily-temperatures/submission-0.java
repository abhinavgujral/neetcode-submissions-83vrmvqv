class Solution {
    public int[] dailyTemperatures(int[] temperatures) {


         Stack<Integer> stack = new Stack<Integer>();
           int[] dailyTemp= new int[temperatures.length];
         for(int i = temperatures.length-1 ;i>= 0; i--)
         {
            if(stack.isEmpty())
            dailyTemp[i]=0;
            else if(stack.size()>0&& temperatures[stack.peek()]>temperatures[i])
             {
               dailyTemp[i]=stack.peek()-i;
             }else if(stack.size()>0&&temperatures[stack.peek()]<=temperatures[i])
             {

                while(stack.size()>0&&temperatures[stack.peek()]<=temperatures[i])
                 {    stack.pop();
                 }
                if(stack.isEmpty())
                dailyTemp[i]=0;
                else
                dailyTemp[i]=stack.peek()-i;

             }
             stack.push(i);
         }
         return dailyTemp;
    }
}

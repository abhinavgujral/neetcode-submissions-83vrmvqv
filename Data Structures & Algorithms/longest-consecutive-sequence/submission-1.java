class Solution {
    public int longestConsecutive(int[] nums) {
if(nums.length==0)
return 0;
        Set<Integer> numSet=
        Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        
      int longestConsecutive=1;
        for(Integer num:numSet){
            int currentConsecutive=1;
            if(numSet.contains(num-1))
                continue;
             
                else
                {
                     
                   while(numSet.contains(num+1))
                   {
                   currentConsecutive++;
                   num=num+1;
                   }

                }

            longestConsecutive=    Math.max(longestConsecutive,currentConsecutive);
        }
        return longestConsecutive;
    }
}

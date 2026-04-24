class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

       
        int[][] pairs = new int[position.length][2];
        int fleets=0;
        double lastFleetTime=0;
        for(int i=0;i<position.length;i++){
            pairs[i][0]=position[i];
            pairs[i][1]=speed[i];
        }
        Arrays.sort(pairs,(a,b)->b[0]-a[0]);
        for(int i=0; i<pairs.length;i++)
        {
            double currentTime = (double)(target-pairs[i][0])/pairs[i][1];
             if(currentTime > lastFleetTime){
                fleets++;
                lastFleetTime = currentTime;
             }

        }
        return fleets;
        
    }
}
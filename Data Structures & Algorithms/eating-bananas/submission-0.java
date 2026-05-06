class Solution {
    public boolean canEatBananas(int[] piles, int h,int k){


    for(int i=0;i<piles.length;i++){
            h -= piles[i]/k;
            if(piles[i]%k > 0) h -= 1;
    }

    return h>=0 ? true: false;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
          int maxVal = Integer.MIN_VALUE;
        for(int i=0; i < piles.length; i++) {
            maxVal = Math.max(maxVal, piles[i]);
        }

        int start=1, end=maxVal, ans=-1;
           while(start<=end){
            int k=start+(end-start)/2;
            if(canEatBananas(piles, h, k)) {
                ans = k;
                end = k - 1;
            } else {
                start = k + 1;
            }
        }
        return ans;
           }        


    }


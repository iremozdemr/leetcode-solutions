class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int biggestNumber = 0;

        for(int i=0; i<costs.length; i++){
            if(costs[i] > biggestNumber){
                biggestNumber = costs[i];
            }
        }

        int[] frequency = new int[biggestNumber+1];

        for(int i=0; i<costs.length; i++){
            int number = costs[i];
            frequency[number]++;
        }

        int[] result = new int[costs.length];

        int index = 0;

        for(int i=0; i<frequency.length; i++){
            int number = frequency[i];
            if(number != 0){
                for(int j=0; j<number; j++){
                    result[index] = i;
                    index++;
                }
            }
        }

        int count = 0;

        for(int i=0; i<result.length; i++){
            int cost = result[i];
            if(coins-cost >= 0){
                coins = coins - cost;
                count++;
            }
        }

        return count;
    }
}
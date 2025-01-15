class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int coins = 0;

        for(int i=piles.length/3; i<piles.length; i = i+2){
            coins += piles[i];
        }

        return coins;
    }
}
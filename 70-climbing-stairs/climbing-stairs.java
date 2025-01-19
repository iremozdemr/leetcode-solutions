class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        
        int[] array = new int[n+1];
        array[0] = 1;
        array[1] = 1;
        array[2] = 2;

        for(int i=3; i<=n; i++){
            array[i] = array[i-1] + array[i-2];
        }

        return array[n];
    }
}

/*
n=1 1
n=2 2
n=3 3
n=4 5
n=5 8
n=6 13
*/
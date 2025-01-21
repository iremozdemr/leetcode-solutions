class Solution {
    public int countTriples(int n) {
        int count = 0;

        for(int a=1; a<=n; a++){
            double squareA = Math.pow(a,2);
            for(int b=1; b<=n; b++){
                double squareB = Math.pow(b,2);
                for(int c=1; c<=n; c++){
                    double squareC = Math.pow(c,2);

                    if(squareA + squareB == squareC){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
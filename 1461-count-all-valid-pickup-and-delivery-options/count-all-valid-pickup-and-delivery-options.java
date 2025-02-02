class Solution {
    public int countOrders(int n) {
        int elementCount = n*2;
        double divide = Math.pow(2,n);
        //divide = divide % ((long) (Math.pow(10,9)) + 7);
        int result = factorial(elementCount,divide);

        return result;
    }

    public int factorial(int number,double divide) {
        double result = 1;

        for (int factor = 2; factor <= number; factor++) {
            if(divide >= 2 && factor % 2 == 0){
                result *= factor / 2;
                divide = divide / 2;
                result = result % (Math.pow(10,9) + 7);
            }
            else{
                result *= factor;
                result = result % (Math.pow(10,9) + 7);
            }
        }

        result = result % (Math.pow(10,9) + 7);
        return (int) result;
    }
}
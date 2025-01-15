class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];

        int num1 = num%10;
        digits[0] = num1;

        int num2 = ((num%100)-num1)/10;
        digits[1] = num2;

        int num3 = (num / 100)%10;
        digits[2] = num3;

        int num4 = num / 1000;
        digits[3] = num4;

        Arrays.sort(digits);

        int number1 = (digits[0] * 10) + digits[3];
        int number2 = (digits[1] * 10) + digits[2];

        return number1 + number2;
    }
}
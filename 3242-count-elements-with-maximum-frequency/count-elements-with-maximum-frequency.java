class Solution {
    public int maxFrequencyElements(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int number = nums[i];
            if(numbers.contains(number) == false){
                numbers.add(number);
            }
        }

        int[] frequency = new int[numbers.size()];

        for(int i=0; i<nums.length; i++){
            int number = nums[i];
            int index = numbers.indexOf(number);
            frequency[index]++;
        }

        int maxFrequency = 0;
        int total = 0;

        for(int i=0; i<frequency.length; i++){
            if(frequency[i] > maxFrequency){
                maxFrequency = frequency[i];
            }
        }

        for(int i=0; i<frequency.length; i++){
            if(frequency[i] == maxFrequency){
                total += frequency[i];
            }
        }

        return total;
    }
}
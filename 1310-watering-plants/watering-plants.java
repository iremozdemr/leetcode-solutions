class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int can = capacity;

        int stepsCount = 0;

        for(int i=0; i<plants.length; i++){
            System.out.println(can);
            if(can >= plants[i]){
                stepsCount++;
                can = can - plants[i];
            }
            else{
                stepsCount = stepsCount + i + i + 1;
                can = capacity;
                can = can - plants[i];
            }
        }

        return stepsCount;
    }
}
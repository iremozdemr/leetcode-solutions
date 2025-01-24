class Solution {
    public int findCenter(int[][] edges) {
        if(edges.length == 2){
            ArrayList<Integer> list = new ArrayList<>();

            int a = edges[0][0];
            int b = edges[0][1];
            int c = edges[1][0];
            int d = edges[1][1];

            if(list.contains(a)){
                return a;
            }
            else{
                list.add(a);
            }

            if(list.contains(b)){
                return b;
            }
            else{
                list.add(b);
            }

            if(list.contains(c)){
                return c;
            }
            else{
                list.add(c);
            }

            if(list.contains(d)){
                return d;
            }
            else{
                list.add(d);
            }
        }
        else{
            int result1 = edges[0][0];
            int result2 = edges[0][1];

            int num1 = edges[1][0];
            int num2 = edges[1][1];

            int num3 = edges[2][0];
            int num4 = edges[2][1];

            if(num1 == result1 && num3 == result1){
                return result1;
            }
            if(num1 == result1 && num4 == result1){
                return result1;
            }
            if(num2 == result1 && num3 == result1){
                return result1;
            }
            if(num2 == result1 && num4 == result1){
                return result1;
            }

            if(num1 == result2 && num3 == result2){
                return result2;
            }
            if(num1 == result2 && num4 == result2){
                return result2;
            }
            if(num2 == result2 && num3 == result2){
                return result2;
            }
            if(num2 == result2 && num4 == result2){
                return result2;
            }
        }

        return 0;
    }
}
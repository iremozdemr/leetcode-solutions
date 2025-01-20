class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length == 0 && n == 1){
            return 1;
        }
        if(trust.length == 0 && n > 1){
            return -1;
        }

        int judge = trust[0][1];
        ArrayList<Integer> judges = new ArrayList<Integer>();
        ArrayList<Integer> labels = new ArrayList<Integer>();

        for(int i=0; i<trust.length; i++){
            int label = trust[i][0];
            int person = trust[i][1];

            if(judges.contains(person) == false){
                judges.add(person);
            }
        }

        for(int i=0; i<trust.length; i++){
            int label = trust[i][0];
            int person = trust[i][1];

            if(labels.contains(label) == false){
                labels.add(label);
            }
        }

        if(labels.size() != n-1){
            return -1;
        }

        for(int i=0; i<trust.length; i++){
            int label = trust[i][0];
            int person = trust[i][1];

            if(judges.contains(label)){
                judges.remove(judges.indexOf(label));
            }
        }

        for(Integer judgeFromList : judges){
            for(int i=0; i<trust.length; i++){
                int label = trust[i][0];
                int person = trust[i][1];

                if(person == judgeFromList){
                    if(labels.contains(label)){
                        labels.remove(labels.indexOf(label));
                    }
                }
            }
        }

        if(judges.size() == 0){
            return -1;
        }
        else if(labels.size() != 0){
            return -1;
        }
        else{
            return judges.get(0);
        }
    }
}
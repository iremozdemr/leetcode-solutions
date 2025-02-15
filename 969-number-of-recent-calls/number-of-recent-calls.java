class RecentCounter {

    ArrayList<Integer> list;

    public RecentCounter() {
        list = new ArrayList<>();
    }
    
    public int ping(int t) {
        int count = 0;
        list.add(t);
        int start = t-3000;
        int end = t;

        for(int i=0; i<list.size(); i++){
            if(list.get(i) >= start && list.get(i) <= end){
                count++;
            }
        }

        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
class SmallestInfiniteSet {
    ArrayList<Integer> list;

    public SmallestInfiniteSet() {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
    }
    
    public int popSmallest() {
        int number = list.get(0);
        int last = list.get(list.size()-1);
        list.add(last+1);
        list.remove(0);

        return number;
    }
    
    public void addBack(int num) {
        if(list.contains(num) == false && num < list.get(list.size()-1)){
            list.add(num);
            list.sort(null);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
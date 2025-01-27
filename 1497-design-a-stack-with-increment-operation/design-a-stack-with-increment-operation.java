class CustomStack {
    int maxSize = 0;
    int size = 0;
    ArrayList<Integer> list = null;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        if(size < maxSize){
            list.add(x);
            size++;
        }
    }
    
    public int pop() {
        if(size == 0){
            return -1;
        }
        else{
            int number = list.get(list.size()-1);
            list.remove(list.size()-1);
            size--;
            return number;
        }
    }
    
    public void increment(int k, int val) {
        if(size >= k){
            for(int i=0; i<k; i++){
                int number = list.get(i);
                list.set(i,number+val);
            }
        }
        else{
            for(int i=0; i<size; i++){
                int number = list.get(i);
                list.set(i,number+val);
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
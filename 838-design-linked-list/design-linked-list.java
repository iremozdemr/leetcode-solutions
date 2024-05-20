class MyLinkedList {

    private class ListNode{
        int val;
        ListNode next;

        public ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    ListNode head = null;
    ListNode tail = null;
    int size = 0;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index >= size || index<0){
            return -1;
        }
        else{
            ListNode temp = head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            return temp.val;
        }
    }
    
    public void addAtHead(int val) {
        if(head == null){
            ListNode newNode = new ListNode(val,null);
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            ListNode newNode = new ListNode(val,head);
            head = newNode;
            size++;
        }
    }
    
    public void addAtTail(int val) {
        if(head == null){
            ListNode newNode = new ListNode(val,null);
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            ListNode newNode = new ListNode(val,null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size || index<0){
            return;
        }
        else if(index == 0){
            addAtHead(val);
        }
        else if(index == size){
            addAtTail(val);
        }
        else{
            ListNode temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            ListNode before = temp;
            ListNode after = temp.next;
            ListNode newNode = new ListNode(val,after);
            before.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size || index<0 || size==0){
            return;
        }
        else if(index == 0){
            head = head.next;
            size--;
        }
        else{
            ListNode temp = head;

            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }

            ListNode before = temp;
            ListNode deleted = temp.next;
            ListNode after = temp.next.next;

            before.next = after;
            size--;

            if(index == size){
                tail = before;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
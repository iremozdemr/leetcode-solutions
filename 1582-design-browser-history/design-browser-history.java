class BrowserHistory {

    private class Node{
        String data;
        Node prev;
        Node next;

        public Node(String data){
            this.data = data;
            next = null;
            prev = null;
        }

        public Node(String data,Node prev,Node next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    Node current = new Node(null,null,null);

    public BrowserHistory(String homepage){
        Node homePageNode = new Node(homepage);
        current = homePageNode;
    }
    
    public void visit(String url){
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }
    
    public String back(int steps){
        while(steps > 0){
            if(current.prev == null){
                return current.data;
            }
            current = current.prev;
            steps--;
        }
        return current.data;
    }
    
    public String forward(int steps){
        while(steps > 0){
            if(current.next == null){
                return current.data;
            }
            current = current.next;
            steps--;
        }
        return current.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
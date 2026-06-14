class MyLinkedList {
    class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head=null;
        tail=null;
        size = 0;
    }

    // Time complexity: O(1), where n is the number of nodes in the list
    // Space complexity: O(1), as we are only using a constant amount of space
    public int count() {
        return size;
    }
    
    // Time complexity: O(n), where n is the index
    // Space complexity: O(1), as we are only using a constant amount of space
    public int get(int index) {
        if(index >= count()){
            return -1;
        }
        Node temp=head;
        while(index > 0){
            temp=temp.next;
            index--;
        }
        return temp.data;
    }
    
    // Time complexity: O(1), as we are only updating the head node
    // Space complexity: O(1), as we are only using a constant amount of space
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(count() == 0){
            tail=newNode;
            head=newNode;
        } else {
            newNode.next=head;
            head=newNode;
        }
        size++;
    }
    
    // Time complexity: O(1), where n is the number of nodes in the list
    // Space complexity: O(1), as we are only using a constant amount of space
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(count() == 0){
            head=newNode;
            tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    
    // Time complexity: O(n), where n is the index
    // Space complexity: O(1), as we are only using a constant amount of space
    public void addAtIndex(int index, int val) {
        if(index > count()){
            return;
        }
        Node newNode=new Node(val);
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == count()){
            addAtTail(val);
            return;
        }
        Node temp=head;
        while(index > 1){
            temp=temp.next;
            index--;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    
    // Time complexity: O(n), where n is the index
    // Space complexity: O(1), as we are only using a constant amount of space
    public void deleteAtIndex(int index) {
        if(index >= count()){
            return;
        }
        if(index == 0){
            head=head.next;
            if(head == null){
                tail = null;
            }
        } else {
            Node temp=head;
            while(index > 1){
                temp=temp.next;
                index--;
            }
            temp.next=temp.next.next;
            if(temp.next == null){
                tail=temp;
            }
        }
        size--;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
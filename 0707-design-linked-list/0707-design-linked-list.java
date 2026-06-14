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

    public MyLinkedList() {
        head=null;
        tail=null;
    }

    // Time complexity: O(n), where n is the number of nodes in the list
    // Space complexity: O(1), as we are only using a constant amount of space
    public int count(Node head){
        if(head==null){
            return 0;
        }
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    // Time complexity: O(n), where n is the index
    // Space complexity: O(1), as we are only using a constant amount of space
    public int get(int index) {
        if(index>=count(head)){
            return -1;
        }
        Node temp=head;
        while(index>0){
            temp=temp.next;
            index--;
        }
        return temp.data;
    }
    
    // Time complexity: O(1), as we are only updating the head node
    // Space complexity: O(1), as we are only using a constant amount of space
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(count(head)==0){
            tail=newNode;
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    // Time complexity: O(n), where n is the number of nodes in the list
    // Space complexity: O(1), as we are only using a constant amount of space
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    
    // Time complexity: O(n), where n is the index
    // Space complexity: O(1), as we are only using a constant amount of space
    public void addAtIndex(int index, int val) {
        int len=count(head);
        if(index>len){
            return;
        }
        Node newNode=new Node(val);
        Node temp=head;
        if(index==len){
            addAtTail(val);
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        while(index>1){
            temp=temp.next;
            index--;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    // Time complexity: O(n), where n is the index
    // Space complexity: O(1), as we are only using a constant amount of space
    public void deleteAtIndex(int index) {
        int len=count(head);
        if(len<=index){
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }

        Node temp=head;
        while(index>1){
            temp=temp.next;
            index--;
        }
        temp.next=temp.next.next;
        if(temp.next==null){
            tail=temp;
        }

    }
}

// Your current implementation is mostly correct, but you can improve the time complexity of addAtTail by keeping a reference to the tail node.
// Consider adding a tail node to your MyLinkedList class to improve the efficiency of adding nodes at the end of the list. 

// Time complexity analysis:
// - count: O(n)
// - get: O(n)
// - addAtHead: O(1)
// - addAtTail: O(n)
// - addAtIndex: O(n)
// - deleteAtIndex: O(n)

// Ideal time complexity:
// - count: O(1) (if you keep a size variable)
// - get: O(n)
// - addAtHead: O(1)
// - addAtTail: O(1) (if you keep a tail node)
// - addAtIndex: O(n)
// - deleteAtIndex: O(n)

// Consider submitting your solution and then exploring ways to improve the time complexity of your implementation.

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
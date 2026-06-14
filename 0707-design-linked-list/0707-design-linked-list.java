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

    public MyLinkedList() {
        head=null;
    }

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
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(count(head)==0){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        int len=count(head);
        if(len==0){
            head=newNode;
            return;
        }
        Node temp=head;
        while(len>1){
            temp=temp.next;
            len--;
        }
        temp.next=newNode;
    }
    
    public void addAtIndex(int index, int val) {
        int len=count(head);
        if(index>len){
            return;
        }
        Node newNode=new Node(val);
        Node temp=head;
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

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
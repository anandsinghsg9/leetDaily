class MyLinkedList {
    int data;
    MyLinkedList next;
    MyLinkedList head;
    public MyLinkedList(){
        this.head=null;
    }
    public MyLinkedList(int data){
        this.data=data;
        this.next=null;
    }

    public int get(int index) {
        if(index<0 || head==null){
            return -1;
        }
        int count=0;
        MyLinkedList temp=head;
        while(count<index && temp!=null){
            temp=temp.next;
            count++;
        }
        return (temp==null)? -1:temp.data;
    }
    
    public void addAtHead(int val) {
        MyLinkedList temp=new MyLinkedList(val);
        temp.next=head;
        head=temp;
    }
    
    public void addAtTail(int val) {
        MyLinkedList temp=head;
        MyLinkedList add=new MyLinkedList(val);
        if(head==null ){
            head=add;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=add;
    }
    
    public void addAtIndex(int index, int val) {
        MyLinkedList add=new MyLinkedList(val);
        if(index==0 ){
            addAtHead(val);
            return;
        }
        if(head==null){
            return;
        }
        int count=0;
        MyLinkedList temp=head;
        while(count<(index-1) && temp!=null){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            return;
        }
        add.next=temp.next;
        temp.next=add;
    }
    
    public void deleteAtIndex(int index) {
        if(head==null || index<0){
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        int count=0;
        MyLinkedList temp=head;
        while(count<(index-1) && temp!=null){
            temp=temp.next;
            count++;
        }
        if(temp==null || temp.next==null){
            return;
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
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
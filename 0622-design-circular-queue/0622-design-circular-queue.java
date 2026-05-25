class MyCircularQueue {
    int [] arr;
    int ptr1;
    int ptr2;
    int maxSize;
    int size;

    public MyCircularQueue(int k) {
        arr= new int [k];
        ptr1=-1;
        ptr2=0;
        maxSize=k;
        size=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        ptr1= (ptr1+1)%maxSize;
        arr[ptr1]=value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        ptr2=(ptr2+1)%maxSize;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[ptr2];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[ptr1];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==maxSize;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna
class twoStacks {
    class Stack{
        int peek1;
        int [] arr;
        int peek2;
        public Stack(int size){
            this.arr=new int[size];
            this.peek1=-1;
            this.peek2=size;
        }
    }
    Stack stack;
    
    twoStacks() {
        stack =new Stack(100);
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if(stack.peek1+1==stack.peek2){
            return;
        }
        stack.arr[++stack.peek1]=x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        if((stack.peek2-1)==stack.peek2){
            return;
        }
        stack.arr[--stack.peek2]=x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        if(stack.peek1==-1){
            return -1;
        }
        return stack.arr[stack.peek1--];
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(stack.peek2==stack.arr.length){
            return -1;
        }
        return stack.arr[stack.peek2++];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Node{
    int val;
    Node next;
    Node(){

    }
    Node(int val){
        this.val=val;
    }
}

class MyLinkedList {
    Node head=null;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
       if(head==null){
        return -1;
       }

       int i=0;
       Node temp=head;
       while(i<index){
        temp=temp.next;
        if(temp==null){
            return -1;
        }
        i++;
       }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }
    
    public void addAtTail(int val) {
        Node tail=new Node(val);
        if(head==null){
            head=tail;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=tail;
        }
    }
    
    public void addAtIndex(int index, int val) {
        Node temp1=new Node(val);
        if(head==null && index==0){
            head=temp1;
            return;
        }
        else if(head==null && index!=0){
            return;
        }

        if(head.next==null && index==0){
            temp1.next=head;
            head=temp1;
            return;
        }

        Node temp=head;
        int i=0;
        while(i<(index-1)){
            temp=temp.next;
            if(temp==null){
                return;
            }
            i++;
        }
        temp1.next=temp.next;
        temp.next=temp1;
    }
    
    public void deleteAtIndex(int index) {
        if(head==null){
            return;
        }
        if(head.next==null && index==0){
            head=null;
            return;
        }
        else if(head.next==null && index!=0){
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        int i=0;
        Node temp=head;
        while(i<(index-1)){
            temp=temp.next;
            if(temp==null){
                return;
            }
            i++;
        }
        if(temp.next==null){
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

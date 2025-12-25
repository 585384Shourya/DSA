import java.util.*;
// node class..
class node{
    int data;
    node next;

}
// linked list class..
public class singly_linked_list{
    node hnode;
    node tnode;
    
    // linked list constructor..
    singly_linked_list(node temp){
            hnode=temp;
            tnode=temp;
    }
    
    // add method..
    public void  add(int data){
        node temp=new node();
        if(hnode==tnode){
            tnode=temp;
            hnode.data=data;
            hnode.next=tnode;
        }
        else{
            tnode.data=data;
            tnode.next=temp;
            tnode=temp;
        }
    }
    
    // display method..
    public void display(){
        node temp=hnode;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    // recursively displaying linked list..
    public void  recdisplay(node temp){
        if(temp==null){
            return;
        }
        recdisplay(temp.next);
        System.out.print(temp.data+" ");
    }
    
    // count method..
    public int count(){
        node temp=hnode;
        int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    // new node method..
    public void  newNode(int data,int pos){
        node temp1=hnode;
        node temp=new node();
        temp.data=data;
        if(pos==1){
            temp.next=hnode;
            hnode=temp;
        }
        else{
            int i=1;
            while(i<pos-1){
                temp1=temp1.next;
                i++;
            }
            temp.next=temp1.next;
            temp1.next=temp;
        }

    }
    
    // delete node method..
    public void deleteNode(int pos){
        node temp1=hnode;
        if(pos==1){
            hnode=hnode.next;
        }
        else{
            int i=1;
            while(i<pos-1){
                temp1=temp1.next;
                i++;
            }
            temp1.next=temp1.next.next;
        }
    }
    
    //main method of linked list class.. 
    public static void main(String[] args) {
        // creating a new node..
        node temp=new node();
        // creating a linked list and passing the reference of node to it..
        singly_linked_list l1=new singly_linked_list(temp);
        // adding node to linked list..
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        // displaying linked list..
        System.out.println("Display:");
        l1.display();
        
        // recursively displaying linked list..
        System.out.println();
        System.out.println("Now recursively display:");
        l1.recdisplay(temp);
        
        // counting no of nodes in linked list..
        System.out.println();
        int count=l1.count();
        System.out.println("Count:"+count);
        
        // here is scanner class..
        Scanner sc=new Scanner(System.in);
        int data,pos;
        
        // taking input of data and position for inserting new node..
        System.out.print("Data:");
        data=sc.nextInt();
        System.out.print("Pos:");
        pos=sc.nextInt();
        l1.newNode(data,pos);
        
        // displaying linked list..
        System.out.println("Display:");
        l1.display();
        
        // taking input of position for deleting new node..
        System.out.println();
        System.out.println("Deleting node at");
        System.out.print("Pos:");
        pos=sc.nextInt();
        l1.deleteNode(pos);
        
        // displaying linked list..
        System.out.println("Display:");
        l1.display();
    }
}
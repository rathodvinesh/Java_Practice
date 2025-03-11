package DataStructures.LinkedLists;

import java.util.LinkedList;

public class Creation {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //create node
        Node n = new Node(data);
        size++;
        if(head == null){
            head = tail = n;
            return;
        }
        //newNode.next = head
        n.next = head;
        //head=newNode
        head = n;
    }

    public void addLast(int data){
        //create
        Node n = new Node(data);
        size++;
        //check if null
        if(head == null){
            head=tail=n;
            return;
        }
        //tail.next=n
        tail.next = n;
        //tail=n;
        tail = n;
    }

    public void addMid(int indx,int data){
        //if empty
        if(indx==0){
            addFirst(data);
            return;
        }
        //create node
        Node n = new Node(data);
        size++;
        //add head in temp
        Node temp=head;
        //create index
        int i=1;
        //while for iterating till desired array
        while(i<indx-1){
            temp = temp.next;
            i++;
        }
        //change to next -> to temp.next
        n.next = temp.next;
        //temp.next = n
        temp.next=n;
    }

    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size == 0){
            System.out.print("Empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev= prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int search(int key){

        int i=0;
        Node temp=head;
        if(size==0){
            System.out.println("Empty");
            return -1;
        }
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Creation c = new Creation();
        c.addFirst(1);
//        c.printLL();
        c.addFirst(2);
//        c.printLL();
        c.addLast(5);
//        c.printLL();
        c.addFirst(3);
//        c.printLL();
        c.addFirst(4);
//        c.printLL();
        c.addLast(6);
//        c.printLL();
        c.addMid(2,9);
        c.printLL();
        c.removeFirst();
//        System.out.print(size);;
        c.printLL();
        c.removeLast();
        c.printLL();
//        c.search(5);
        System.out.println(c.search(3));
    }
}

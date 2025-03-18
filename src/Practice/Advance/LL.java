package Practice.Advance;

import java.util.HashSet;

public class LL {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void add(int data){
//        1.create node
//        2. check if no ele
//        3. if Ele present then next = node
//        4. head=n

        Node node = new Node(data);

        if(head==null){
            head=tail=node;
            return;
        }

        node.next=head;
        head=node;
    }

    public static void print(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void dup(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        Node temp=head;
        while (temp!=null){
            if(set.contains(temp.data)){
                System.out.print(temp.data+"->");
            }else{

            set.add(temp.data);
            }
                temp=temp.next;
        }
            System.out.print("null");
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(1);
        add(2);
        print();
        System.out.println();
        dup();
    }
}

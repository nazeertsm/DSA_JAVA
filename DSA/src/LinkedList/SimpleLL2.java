package LinkedList;

class Node{
    int data;
    NodeM next;
    Node(int x){
        data=x;
        next=null;
    }
}

class SimpleLL2 {

    public static void main(String args[])
    {
        NodeM head=new NodeM(10);
        head.next=new NodeM(20);
        head.next.next=new NodeM(30);
        head.next.next.next=new NodeM(40);
        printlist(head);

    }

    public static void printlist(NodeM head){
        NodeM curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
package LinkedList;

class NodeM{
    int data;
    NodeM2 next;
    NodeM(int x){
        data=x;
        next=null;
    }
}

class SimpleLL2 {

    public static void main(String args[])
    {
        NodeM2 head=new NodeM2(10);
        head.next=new NodeM2(20);
        head.next.next=new NodeM2(30);
        head.next.next.next=new NodeM2(40);
        printlist(head);

    }

    public static void printlist(NodeM2 head){
        NodeM2 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
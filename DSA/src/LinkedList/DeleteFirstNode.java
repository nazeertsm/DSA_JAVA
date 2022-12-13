package LinkedList;

class Nodek{
    int data;
    Nodek next;
    Nodek(int x){
        data=x;
        next=null;
    }
}

class DeleteFirstNode {

    public static void main(String args[])
    {
        Nodek head=new Nodek(10);
        head.next=new Nodek(20);
        head.next.next=new Nodek(30);
        printlist(head);
        head=delHead(head);
        printlist(head);

    }

    static Nodek delHead(Nodek head){
        if(head==null)return null;
        else{
            return head.next;
        }
    }
    public static void printlist(Nodek head){
        Nodek curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
} 
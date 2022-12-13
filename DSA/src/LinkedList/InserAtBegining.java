package LinkedList;
/* Linked list Node*/
class SNode {
    int data;
    SNode next;

    SNode(int x)
    {
        data = x;
        next = null;
    }
}

class Main
{
    /* Inserts a new Node at front of the list. */
    static SNode insertBeginning(SNode head, int data)
    {
        SNode newNode = new SNode(data); //1 &2, Allocate the Node & Put in the data

        newNode.next = head; //*3. Make next of new Node as head */
        head = newNode; //  /* 4. Move the head to point to new Node */

        return head;
    }
    /* This display function prints contents of linked list starting from the given node */
    static void display(SNode node) {

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        SNode head = null;
        head = insertBeginning(head,15);
        head = insertBeginning(head,10);
        head = insertBeginning(head,5);

        display(head);
    }
}
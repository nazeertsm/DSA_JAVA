package LinkedList;

class NodeM2 {
    int data;
    NodeM2 next;

    NodeM2 (int x) {
        data = x;
        next = null;
    }
}

public class InsertAtEnd {
    static NodeM2 insertEnd (NodeM2 head, int x) {
        NodeM2 temp = new NodeM2(x);
        if (head == null)
            return temp;
        NodeM2 curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static void main (String args[]) {
        NodeM2 head = null;
        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
        printlist(head);

    }

    public static void printlist (NodeM2 head) {
        NodeM2 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
} 

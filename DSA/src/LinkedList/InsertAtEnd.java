package LinkedList;

class NodeM {
    int data;
    NodeM next;

    NodeM (int x) {
        data = x;
        next = null;
    }
}

public class InsertAtEnd {
    static NodeM insertEnd (NodeM head, int x) {
        NodeM temp = new NodeM(x);
        if (head == null)
            return temp;
        NodeM curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static void main (String args[]) {
        NodeM head = null;
        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
        printlist(head);

    }

    public static void printlist (NodeM head) {
        NodeM curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
} 

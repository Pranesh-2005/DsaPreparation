public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static void print(Node head){
        while(head != null){
            System.out.print(head.data);
            head = head.next;
        }
        System.out.println();
    }
    static Node rev(Node head){
        Node temp = null;
        Node c = head;
        while(c != null){
            Node nxt = c.next;
            c.next = temp;
            temp = c;
            c = nxt;
        }
        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.print("OG");
        print(head);
        head = rev(head);
        System.out.print("Rev");
        print(head);
    }
}

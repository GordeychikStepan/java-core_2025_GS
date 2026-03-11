package LW9.Examples2_LinearList;

public class Example08_CreateTail {

    public static void main(String[] args) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < 10; i++) {
            Node newNode = new Node(i, null);

            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }

            tail = newNode;
        }

        printList(head);
    }

    private static void printList(Node head) {
        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }
}
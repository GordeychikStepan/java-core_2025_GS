package LW9.Tasks;

public class Task08_LinkedList {

    private Task08_Node head;
    private Task08_Node tail;

    public void createHead(int[] values) {
        head = null;
        tail = null;

        for (int value : values) {
            head = new Task08_Node(value, head);
            if (tail == null) {
                tail = head;
            }
        }
    }

    public void createTail(int[] values) {
        head = null;
        tail = null;

        for (int value : values) {
            Task08_Node newNode = new Task08_Node(value, null);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Task08_Node ref = head;

        while (ref != null) {
            builder.append(ref.value).append(" ");
            ref = ref.next;
        }

        return builder.toString().trim();
    }

    public void AddFirst(int value) {
        Task08_Node newNode = new Task08_Node(value, head);
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }
    }

    public void AddLast(int value) {
        Task08_Node newNode = new Task08_Node(value, null);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void Insert(int index, int value) {
        if (index <= 0 || head == null) {
            AddFirst(value);
            return;
        }

        Task08_Node ref = head;
        int k = 0;

        while (ref.next != null && k < index - 1) {
            ref = ref.next;
            k++;
        }

        Task08_Node newNode = new Task08_Node(value, ref.next);
        ref.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void RemoveFirst() {
        if (head == null) {
            return;
        }

        head = head.next;

        if (head == null) {
            tail = null;
        }
    }

    public void RemoveLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        Task08_Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }

        ref.next = null;
        tail = ref;
    }

    public void Remove(int index) {
        if (head == null) {
            return;
        }

        if (index <= 0) {
            RemoveFirst();
            return;
        }

        Task08_Node ref = head;
        int k = 0;

        while (ref.next != null && ref.next.next != null && k < index - 1) {
            ref = ref.next;
            k++;
        }

        if (ref.next != null) {
            if (ref.next == tail) {
                tail = ref;
            }
            ref.next = ref.next.next;
        }
    }

    public void createHeadRec(int[] values) {
        head = null;
        tail = null;
        createHeadRecInternal(values, 0);
    }

    private void createHeadRecInternal(int[] values, int index) {
        if (index >= values.length) {
            return;
        }

        head = new Task08_Node(values[index], head);
        if (tail == null) {
            tail = head;
        }

        createHeadRecInternal(values, index + 1);
    }

    public void createTailRec(int[] values) {
        head = null;
        tail = null;
        createTailRecInternal(values, 0);
    }

    private void createTailRecInternal(int[] values, int index) {
        if (index >= values.length) {
            return;
        }

        Task08_Node newNode = new Task08_Node(values[index], null);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;

        createTailRecInternal(values, index + 1);
    }

    public String toStringRec() {
        return toStringRecInternal(head).trim();
    }

    private String toStringRecInternal(Task08_Node node) {
        if (node == null) {
            return "";
        }

        return node.value + " " + toStringRecInternal(node.next);
    }
}

public class SLL {

    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }
//The Time complexity For insertFirst is O(1)
    public void insertFirst(int val) {
        if (tail == null) {
            tail = head;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size += 1;
    }
//Time complexity to display an element is O(n)
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.print("END\n");

    }
// The time complexity for insertAtMiddle is O(n)
    public void insertAtMiddle(int index, int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertAtEnd(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node newNode = new Node(val, temp.next);
        //newNode.next=temp.next;
        temp.next = newNode;
        size++;

    }
//The time complexity for insertAtEnd is O(1) as we are using tail here
    public void insertAtEnd(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node newnode = new Node(val);
        tail.next = newnode;
        tail = newnode;
        size++;
    }
// The TimeComplexity for deleteFirst is O(1)
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;

    }
// The time complexity is deleteLast is O(1)
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int data = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return data;

    }

    public Node get(int index) {
            Node node=head;
            for(int i=0;i<index;i++){
                node=node.next;
            }
            return node;

    }
    // The time complexity for deleteMiddle is O(n)
    public int deleteMiddle(int index){
        if(size<=1){
            return deleteFirst();
        }
        if(size==index){
            return deleteLast();
        }
        Node prev=get(index-1);
        prev.next=prev.next.next;
        return prev.next.value;
        }
        //Time complexity for finding an element is O(n)
        public Node find(int value) {
            Node node = head;
            while (node != null) {
                if (node.value == value) {
                    return node;
                }

                node = node.next;
            }
            return null;
        }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}

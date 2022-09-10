public class DLL {
    private Node head;
    private Node prev;
    private int size=0;
    public DLL(){
        this.size=0;
    }
    public void insertAtFirst(int data){
            Node newNode= new Node(data);
            newNode.next = head;
            if(head!=null)
            head.prev=newNode;
            newNode.prev = null;
            head = newNode;
            size++;
    }
    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        Node temp=head;
        if(temp.next==null) {
            head.prev = null;
            head.next = null;
            temp = head;
        }
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
            newNode.prev=temp;
            size++;
        }

    public void insertMiddle(int index,int data){
        // this another way of finding an element in the middle
//        if (index == 0) {
//            insertAtFirst(data);
//            return;
//        }
//        if (index == size) {
//            insertAtLast(data);
//            return;
//        }
//        Node temp=head;
//        Node newNode= new Node(data);
//        for(int i=0;i<index-1;i++){
//             temp=temp.next;
//        }
//        newNode.next=temp.next;
//        temp.next=newNode;
//        newNode.prev=temp;
//        size++;
        Node p=find(index);
        System.out.println(p.data);
        if(p==null){
            System.out.println("Element does not exist");
            return;
        }
        Node node= new Node(data);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null) {
            node.next.prev = node;
        }

    }
    public int deleteFirst(){
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }
    public int deleteEnd(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        //System.out.println(temp.data);
        int val = temp.data;
        temp.next=null;
        size--;
        return val;
    }
    public int deleteMiddle(int index){
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        int val=temp.data;
        temp.next=temp.next.next;
        size--;
        return val;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("END");

    }
    public void displayRev(){
        Node temp=head;
        Node last=null;
        while(temp.next!=null){
            temp=temp.next;
            last=temp;
        }
        while(last!=null){
            System.out.print(last.data+ " ->");
            last=last.prev;
        }
        System.out.println("START");
   }
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }

            node = node.next;
        }
        return null;
    }
    public class Node{
        Node prev;
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}

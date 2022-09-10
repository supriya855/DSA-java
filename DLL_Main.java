public class DLL_Main {
    public static void main(String[] args) {
        DLL list1 = new DLL();
        list1.insertAtFirst(2);
        list1.insertAtFirst(4);
        list1.insertAtFirst(5);
        list1.insertAtFirst(6);
        list1.insertAtFirst(7);
        list1.display();
        list1.insertAtLast(77);
        list1.display();
        list1.insertMiddle(2,22);
        list1.display();
       list1.insertMiddle(6,33);
        System.out.println(list1.find(2));
        list1.display();
        list1.displayRev();
        System.out.println("Deleting the element at First "+ list1.deleteFirst());
        System.out.println("Deleting the element at last "+list1.deleteEnd());
        System.out.println("Deleting the element at Middle "+list1.deleteMiddle(3));



    }
}



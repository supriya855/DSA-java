public class Main {
    public static void main(String[] args) {
        SLL list=new SLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertAtEnd(5);
        list.insertAtEnd(99);
        list.insertAtMiddle(3,55);
        System.out.println("Before delete an element");
        list.display();
        System.out.println("\nAfter delete an element"+" \n"+list.deleteFirst());
        list.display();
        System.out.println("\nAfter delete an element at Last"+" \n"+ list.deleteLast());
        list.display();
        System.out.println("\nAfter delete an element at Middle"+" \n"+ list.deleteMiddle(2));
        list.display();
        System.out.println("Finding an element  "+list.find(2));




    }
}

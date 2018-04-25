public class ListTester {    
    public static void main(String[] args) {
        SinglyLinkedList newList = new SinglyLinkedList();
        newList.add(9);
        newList.printValues();
        newList.remove();
        newList.printValues();
    }
}
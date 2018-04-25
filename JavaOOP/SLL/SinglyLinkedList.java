public class SinglyLinkedList{
    private Node head;
    private Node tail;
    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
}
    public void add(int value) {
        if (this.head == null)
            this.head = this.tail;
        else {
            tail.link = new Node(value);
            this.tail = tail.link;
        }
    }
    public void remove(){
        Node target = this.head;
        while(target.getnext()!=null){
            target=target.getnext();
        }
        target = null;
        }
    public void printValues(){
        System.out.println(SinglyLinkedList);
    }
}

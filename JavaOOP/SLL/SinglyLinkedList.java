public class SinglyLinkedList{
    private Node head;
    
    public SinglyLinkedList() {
        this.head = null;
        
}
    public SLL add(int num){
        Node toAdd = new Node(num);
        if (this.head == null){
            this.head = toAdd;
            return this;
        }
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(toAdd);
        return this;
}

    public void remove(){
        Node current = this.head;
        while(current.getnext()!=null){
            current=current.getnext();
        }
        current = null;
        }
    public void printValues(){
        Node current = head;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
    }
}

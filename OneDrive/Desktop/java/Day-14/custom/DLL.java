package custom;

public class DLL {

    private Node head;
    // insert at beginning
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        node.prev=null;
        if (head != null) {
            head.prev=node;
        }
        head=node;
    }
    //  insert at last
    public void insertLast(int val){
        Node node=new Node(val);
        Node last=head;

        node.next=null;
        if (head == null) {
            node.prev=null;
            head=node;
        }
        while (last.next != null) {
            last= last.next;
        }
        last.next=node;
        node.prev=last;
    }
    public Node find(int value){
        Node node=head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }node= node.next;
        }return null;
    }
    //  insert a node after a given value
    public void insertAfter(int after, int val){
        Node  p=  find(after);
        if (p==null) {
            System.out.println("Does not exists");
            return;
        }
        Node node=new Node(val);
        node.next= p.next;
        p.next=node;
        node.prev= p;
        if (node.next != null) {
            node.next.prev=node;
        }
    }
    //  display D.L.L
    public void display(){
        Node node = head;
        Node last = null;
        // System.out.print("START -> ");
        while (node != null) {
            System.out.print(node.val+ " -> ");
            last = node;
            node = node.next;
        }System.out.println("END");
    }
    //  display  D.L.L in Reverse
    public void displayRev(){
        Node node = head;
        Node last = null;
        while (node != null) { 
            last = node;
            node = node.next;
        }
        // System.out.print("END -> ");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next, Node prev){
            this.val= val;
            this.next=next;
            this.prev=prev;
        }
        
    }
}

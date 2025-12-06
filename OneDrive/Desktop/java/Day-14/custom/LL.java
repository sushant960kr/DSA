package custom;

import java.util.List;

//  package bna reh hai
public class LL {
    // using custom linked list
    private Node head;
    private Node tail;
    public int size;

    public LL() {
        this.size = 0; // initialize size properly
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail== null) {
            tail=head;
        }
        size +=1;
    }
    public void insertLast(int val){
        if (tail==null) {
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val, int index){
        if (index==0) {
            insertFirst(val);
            return;
        }
        if (index==size) {
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node= new Node(val, temp.next);
        temp.next=node;
        size++;
    }
    public int deleteFirst(){
        int val= head.value;
        head= head.next;
        if (head==null) {
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast=get(size -2);
        int val= tail.value;
        tail= secondLast;
        tail.next=null;
        size--;
        return val;
    }
    public int delete(int index){
        if (index==0) {
            return deleteFirst();
        }
        if (index== size-1) {
            return deleteLast();
        }
        Node prev= get(index - 1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node =node.next;
        }
        return node;
    }
    //  delete N th node (garbage collector automatic delete krega)
    public void deleteNthNode(int n){
        //  calculate size=0;
        int siz=0;
        Node temp=head;
        while (temp != null) {
            temp = temp.next;
            siz++;
        }
        if (n==size) {
            head=head.next;
        }
        //  size -n
        int i=1;
        int iToFind= siz - n;
        Node prev=head;
        while (i < iToFind) {
            prev= prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return;
    }
    // (slow-fast approach)
    public Node findmid(Node head){
        Node slow=head;
        Node fast= head;
        while (fast != null && fast.next != null) {
            slow= slow.next; //+1
            fast= fast.next.next; //+2
        }
        return slow ; // slow is middle
    }
    public boolean checkPalidrome(){
        if (head == null || head.next == null ) {
            return true;
        }
        //  find mid
        Node midNode = findmid(head);
        //  reverse 2nd half array
        Node prev= null;
        Node curr= midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr= next;
        }
        Node right= prev; // right half head
        Node left= head;
        // check left and right
        while (right != null) {
            if (left.value != right.value) {
                return false;
            }
            left =left.next;
            right=right.next;
        }
        return true;

    }
    //  Q.NO-> 25
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        while (true) {
        ListNode last= prev;
        ListNode newEnd = current;

        //  reverse b/t indices 
        ListNode next= current.next;
        for (int i = 0; current != null && i < k ; i++) {
            current.next= prev;
            prev= current;
            current= next;
            if (next != null) {
                next =next.next;
            }
        }
        if (last != null) {
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=current;
        if (current == null) {
            break;
        }
        prev = newEnd;
        }
        return head;
    }
    //  reverse ll
    public void reverse(){
        Node prev= null;
        Node curr= tail =head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr= next;
        }head=prev;
        
    }
    //  question 83
    public void removeDuplicates(){
        Node node =head;
        while (node.next != null) {
            if (node.value ==node.next.value) {
                node.next= node.next.next;
                size--;   // skip kregai to size gets reduces
            }else{
                node = node.next;
            }
        }
    }
    // merge qno -> 21
    public static LL merge(LL first, LL second){
        Node f=first.head;
        Node s=second.head;
        
        LL ans=new LL();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f=f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while ( f != null) {
            ans.insertLast(f.value);
                f=f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
                s=s.next;
        }
        return ans;
    }
    //  Q.NO-> 92
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left==right) {
            return head;
        }
        //  skip the first left -1 nodes 
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; i < left-1 && current != null; i++) {
            prev= current;
            current=current.next;

        }
        ListNode last= prev;
        ListNode newEnd = current;

        //  reverse b/t indices 
        ListNode next= current.next;
        for (int i = 0; current != null && i < right-left+1; i++) {
            current.next= prev;
            prev= current;
            current= next;
            if (next != null) {
                next =next.next;
            }
        }
        if (last != null) {
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=current;
        return head;
    }
    //  q np -> 143
    public void reorderList(ListNode head) {
        if (head == null || head.next== null) {
            return;
        }
        ListNode mid middleNode(head);
        ListNode hs= reverse(mid);
        ListNode hf= head;
        //  rearrange
        while (hs != null && hs!= null) {
            ListNode temp=hf.next;
            hf.next = hs;
            hf= temp;

            temp= hs.next;
            hs.next= hf;
            hs= temp;
        }
        //  next of tail to null
        if (hf != null) {
            hf.next= null;

        }
    }
    //  q no -> 876
    public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;

        while (f != null && f.next != null) {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    
    //  happy number
    public boolean isHappy(int n){
        int slow=n;
        int fast=n;

        do{
            slow =findSquare(slow);
            fast=findSquare(fast);
        }while(slow != fast);

        if (slow ==1) {
            return true;

        }
        return false;

    }
    private int findSquare(int number){
        int ans=0;
        while (number > 0) {
            int rem= number % 10;
            ans += rem*rem;
            number /=10;
        }return ans;
    }

    // recursive approach
    public int helper(Node head, int key){
        if (head != null) {
            return -1;
        }
        if (head.value==key) {
            return 0;
        }
        int idx= helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public int Search(int key){
        Node temp=head;
        int i=0;
        while (temp != null) {
            if (temp.value==key) {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    //  find the index which has this value
    public Node find(int value){
        Node node=head;
        while (node != null) {
            if (node.value== value) {
                return node;
            }
            node= node.next;
        }
        return null;
    }
    
    public void display(){
        Node temp=head;
        while ( temp != null) {
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}

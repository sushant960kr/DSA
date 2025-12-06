import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bTree {

    public bTree(int value){

    }
    private static class Node {
         int value;
        Node left;
        Node right;
        public Node(int value){
            this.value= value;
        }
        
    }
    private Node root;
    // insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the Root Node: ");
        int value = scanner.nextInt();
        root= new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of "+node.value);
        boolean left= scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of "+ node.value);
            int value= scanner.nextInt();
            node.left= new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of "+node.value);
        boolean right= scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of "+ node.value);
            int value= scanner.nextInt();
            node.right= new Node(value);
            populate(scanner, node.right);
        }
    }
    public void display(){
        display(root," ");
    }
    private void display(Node node, String indent){
    if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent +"\t");
        display(node.right , indent +" \t");
    }
    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }
    private void prettyDisplay(Node node,int level){
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level+1);

        if (level != 0) {
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }System.out.println("|----->" +node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level+1);
    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if (node == null) {
            return;
        }
        System.out.println(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void Inorder(){
        Inorder(root);
    }
    private void Inorder(Node node){
        if (node == null) {
            return;
        }
        preorder(node.left);
        System.out.println(node.value+" ");
        
        preorder(node.right);
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if (node == null) {
            return;
        }
        
        preorder(node.left);
        preorder(node.right);
        System.out.println(node.value+" ");
    }

    public static void levelOrder(Node node){
        if (node == null) {
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode= q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.println(currNode.value+" ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    // sum of all nodes

    //  count no of nodes
    public static int count(Node node){
        if (node== null) {
            return 0;
        }
        int leftCount = count(node.left);
        int rightCount= count(node.right);
        return leftCount + rightCount +1;
    }
    //  calculate height of tree
    public static int height(Node node){
        if (node == null) {
            return 0;
        }
        int lh= height(node.left);
        int rh= height(node.right);
        return Math.max(lh, rh) + 1;

    }
 
    //  subtree of another tree
    public static boolean isSubTree(Node root, Node  subRoot){
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        boolean leftAns= isSubTree(root.left, subRoot);
        boolean rightAns = isSubTree(root.right, subRoot);
        return leftAns || rightAns;
    }
    public static boolean isIdentical(Node node, Node subRoot){
        if (node == null && subRoot == null) {
            return true;
        }else if (node  == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
     }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        bTree t=new bTree(0);
        t.populate(scanner);
        t.prettyDisplay();
    }
}

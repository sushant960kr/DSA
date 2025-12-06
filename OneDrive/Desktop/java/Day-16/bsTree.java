import javax.swing.tree.TreeNode;

public class bsTree {
    public class  Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value= value;
        }
        public int getValue(){
            return value;
        }
        
    }
    private Node root;

    public bsTree(){

    }
    public int height(Node node){
        if (node== null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root== null;
    }
    // Insert into BST
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }

        return node;  // important
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void populateSorted(int[] nums){
        populateSorted(nums , 0, nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
        if (start >= end) {
            return;
        }
        int mid= (start + end )/ 2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums, mid+1, end);
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if (node == null) {
            return true;
        }
        int lh = height(node.left);
        int rh = height(node.right);

        return Math.abs(lh - rh) <= 1 && balanced(node.left) && balanced(node.right);

        // return Math.abs((height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right));
    }
    public void display(){
        display(this.root, "Root Node: ");
    }
    public void display(Node node, String details){
        if (node == null) {
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, "Left child of "+ node.getValue() +" : ");
        display(node.right, "Right child of "+ node.getValue() +" : ");

    }
    public static Node insrt(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insrt(root.left, val);
        }else{
            root.right= insrt(root.right, val)
        }return root;
    }
    static void Inorder(Node root){
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.println(root.data+" ");
        Inorder(root.right);
    }
    //  delete node
    public static Node deleteNode(Node root, int val){
        if (root.val < val) {
            root.right= deleteNode(root.right, val);
        }else if (root.val > val) {
            root.left = deleteNode(root.left, val);
        }else{
            //  case 1
            if (root.left ==  null && root.right == null) {
                return null;
            }
            //  case 2 - single child
            if (root.left == null ) {
                return root.right;
            }else if (root.right == null) {
                return root.left;
            }
            //  case 3- both children
            Node IS = findInorderSuccessor(root.right);
            root.val = IS.val;
            root.right = deleteNode(root.right, IS.val);
        }
        return root;
    }
    private TreeNode findInorderSuccessor(TreeNode root){
        while ( root.left != null) {
            root= root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        bsTree t=new bsTree();
        int[] nums= {5,2,7,1,4,6,9,8,3};
            t.populate(nums);
            t.display();
            System.out.println("\nIs BST Balanced? -> " + t.balanced());
            Node root = null;

            for (int i = 0; i < value.length; i++) {
                root= insrt(root, value[i]);
           }
           Inorder(root);
           System.out.println();


        
    }
}

public class AVL {

    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {}

    // Insert into AVL
    public void insert(int value) {
        root = insert(root, value);
    }

    public int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        } else {
            return node; // no duplicates
        }

        // update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // balance it
        return balance(node);
    }

    // Balance factor
    private int getBalance(Node node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    // Balance the node
    private Node balance(Node node) {
        int balance = getBalance(node);

        // Left heavy
        if (balance > 1) {
            if (getBalance(node.left) < 0) {
                node.left = leftRotate(node.left); // LR Case
            }
            return rightRotate(node); // LL Case
        }

        // Right heavy
        if (balance < -1) {
            if (getBalance(node.right) > 0) {
                node.right = rightRotate(node.right); // RL Case
            }
            return leftRotate(node); // RR Case
        }

        return node;
    }

    // Right Rotate
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotate
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) return true;

        int bf = getBalance(node);

        return Math.abs(bf) <= 1 &&
               isBalanced(node.left) &&
               isBalanced(node.right);
    }
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);

        System.out.println("Tree Balanced? " + tree.isBalanced());
    }
}

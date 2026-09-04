import java.util.Scanner;

class BSTNode {
    int key;
    BSTNode left, right;

    public BSTNode(int item) {
        key = item;
        left = right = null;
    }
}

public class bst1 {
    BSTNode root;

    bst1() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    BSTNode insertRec(BSTNode root, int key) {
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        bst1 tree = new bst1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes to insert:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            tree.insert(val);
        }

        System.out.println("\nInorder traversal of BST:");
        tree.inorder();

        sc.close();
    }
}

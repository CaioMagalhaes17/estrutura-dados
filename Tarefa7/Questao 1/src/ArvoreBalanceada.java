import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class ArvoreBalanceada {
    private TreeNode root;

    public ArvoreBalanceada() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    public void balanceTree() {
        List<Integer> elements = new ArrayList<>();
        inOrderTraversal(root, elements);

        root = sortedArrayToBST(elements, 0, elements.size() - 1);
    }

    private void inOrderTraversal(TreeNode node, List<Integer> elements) {
        if (node == null)
            return;
        inOrderTraversal(node.left, elements);
        elements.add(node.value);
        inOrderTraversal(node.right, elements);
    }

    private TreeNode sortedArrayToBST(List<Integer> elements, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(elements.get(mid));

        node.left = sortedArrayToBST(elements, start, mid - 1);
        node.right = sortedArrayToBST(elements, mid + 1, end);

        return node;
    }

    public void printInOrder() {
        inOrder(root);
    }

    private void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        ArvoreBalanceada tree = new ArvoreBalanceada();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(8);

        System.out.println("Árvore original (inorder):");
        tree.printInOrder();

        tree.balanceTree();

        System.out.println("\nÁrvore balanceada (inorder):");
        tree.printInOrder();
    }
}

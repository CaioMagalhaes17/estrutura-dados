class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class MenorElemento {
    TreeNode root;

    public MenorElemento() {
        root = null;
    }

    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("A árvore está vazia.");
        }

        return findMinRecursive(root);
    }

    private int findMinRecursive(TreeNode node) {
        if (node.left == null) {
            return node.val; // Encontrou o menor elemento
        }
        return findMinRecursive(node.left);
    }

    public static void main(String[] args) {
        MenorElemento bst = new MenorElemento();

        bst.root = new TreeNode(10);
        bst.root.left = new TreeNode(5);
        bst.root.right = new TreeNode(15);
        bst.root.left.left = new TreeNode(3);
        bst.root.left.right = new TreeNode(8);

        int menorElemento = bst.findMin();
        System.out.println("Menor elemento na árvore: " + menorElemento);
    }
}

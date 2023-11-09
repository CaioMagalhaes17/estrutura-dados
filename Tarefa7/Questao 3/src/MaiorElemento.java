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

public class MaiorElemento {
    TreeNode root;

    public MaiorElemento() {
        root = null;
    }

    public int findMax() {
        if (root == null) {
            throw new IllegalStateException("A árvore está vazia.");
        }

        return findMaxRecursive(root);
    }

    private int findMaxRecursive(TreeNode node) {
        if (node.right == null) {
            return node.val; // Encontrou o maior elemento
        }
        return findMaxRecursive(node.right);
    }

    public static void main(String[] args) {
        MaiorElemento bst = new MaiorElemento();

        bst.root = new TreeNode(10);
        bst.root.left = new TreeNode(5);
        bst.root.right = new TreeNode(15);
        bst.root.left.left = new TreeNode(3);
        bst.root.left.right = new TreeNode(8);

        int maiorElemento = bst.findMax();
        System.out.println("Maior elemento na árvore: " + maiorElemento);
    }
}

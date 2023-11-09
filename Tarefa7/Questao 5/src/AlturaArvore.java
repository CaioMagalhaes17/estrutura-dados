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

public class AlturaArvore {
    TreeNode root;

    public AlturaArvore() {
        root = null;
    }

    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        AlturaArvore tree = new AlturaArvore();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(15);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(8);

        int altura = tree.getHeight(tree.root);
        System.out.println("Altura da árvore: " + altura);
    }
}

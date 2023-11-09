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

public class ComparacaoArvores {
    TreeNode root;

    public ComparacaoArvores() {
        root = null;
    }

    public static boolean areIdentical(TreeNode root1, TreeNode root2) {
        // Se ambos os nós são nulos, são idênticos
        if (root1 == null && root2 == null) {
            return true;
        }

        // Se um dos nós é nulo e o outro não, não são idênticos
        if (root1 == null || root2 == null) {
            return false;
        }

        // Verifica se os valores são iguais e se as subárvores também são idênticas
        return (root1.val == root2.val) &&
                areIdentical(root1.left, root2.left) &&
                areIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        ComparacaoArvores tree1 = new ComparacaoArvores();
        tree1.root = new TreeNode(10);
        tree1.root.left = new TreeNode(5);
        tree1.root.right = new TreeNode(15);

        ComparacaoArvores tree2 = new ComparacaoArvores();
        tree2.root = new TreeNode(10);
        tree2.root.left = new TreeNode(5);
        tree2.root.right = new TreeNode(15);

        boolean result = areIdentical(tree1.root, tree2.root);
        if (result) {
            System.out.println("As árvores são idênticas.");
        } else {
            System.out.println("As árvores não são idênticas.");
        }
    }
}

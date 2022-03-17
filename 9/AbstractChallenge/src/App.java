public class App {
    public static void main(String[] args) throws Exception {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        // String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney
        // Canberra";
        String stringData = "5 7 8 2 1 3 4 6 0 9";

        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("3"));
        tree.removeItem(new Node("9"));
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("5"));
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

    }
}

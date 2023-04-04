public class Program_BST{

  public static void main(String[] args) {

    MyBST tree = new MyBST();

    tree.insert(249, "John Ray", 8.6);
    tree.insert(247, "Chris Mat", 7.5);
    tree.insert(24, "Anubhav Sinha", 9.3);
    tree.insert(310, "Pedro Rodri", 8.1);
    tree.insert(86, "Luis Arano", 9.9);
    tree.insert(99, "Will Joe", 8.5);
    tree.insert(255, "Chris Prat", 9.4);
    tree.insert(135, "Leo Garcia", 9.7);
    tree.insert(303, "David James", 6.5);
    tree.insert(67, "Chritian Ben", 7.4);

    System.out.println("\nRunning in-order traversal : ");
    tree.inOrder(tree.root);

    System.out.println("\nDeleting record with id no. 99");
    tree.delete(99);

    System.out.println();
    System.out.println("\nRunning in-order traversal : ");
    tree.inOrder(tree.root);

    System.out.println();
    System.out.println("\nRunning pre-order traversal : ");
    tree.preOrder(tree.root);

    System.out.println();
    System.out.println("\nRunning post-order traversal : ");
    tree.postOrder(tree.root);

    tree.find(249);

    System.out.println("\nDeleting record with id no. 310");
    tree.delete(310);

    System.out.println("\nRunning in-order traversal : ");
    tree.inOrder(tree.root);
    System.out.println();

  }
}
package _03_Intro_to_Binary_Trees;

public class BinaryTreeDemo {

    /*
     * A Binary Tree is a data structure that makes use of nodes and references
     * like a LinkedList, but instead of the nodes pointing to a previous node
     * or next node in an unorderd list they each points to two child nodes that
     * are below them in the hierarchy.
     * 
     * Some important properties of BinaryTree are:
     * 
     * -The left node is always a smaller value than its parent and the right
     * node is always a larger value. This is a property you have seen in some
     * form already via Binary Search.
     * 
     * -Empty nodes are null references.
     * 
     * -The parent node at the very top of the tree is called the root.
     * 
     * 1. Read through the BinaryTree and Node classes.
     * done
     * 2. Create a BinaryTree of any type you like.
     * done
     * 3. Try using some BinaryTree methods to insert, search for, delete and
     * print elements.
     * done
     * 4. Save the root into a Node Object and use references to traverse
     * through the BinaryTree and perform an operation on every element(You may
     * choose to do this recursively or iteratively). Then print it out to see
     * if it worked.
     * 
     */
    public static BinaryTree<Integer> valuetree = new BinaryTree<Integer>();
    public static void main(String[] args) {
      valuetree.insert(117);
      valuetree.insert(114);
      valuetree.insert(116);
      valuetree.insert(112);
      valuetree.insert(94);
      valuetree.insert(97);
      valuetree.insert(93);
      valuetree.insert(54);
      valuetree.insert(57);
      valuetree.insert(42);
      valuetree.insert(31);
      valuetree.insert(15);
      valuetree.printHorizontal();
      valuetree.delete(31);
      valuetree.delete(112);
      valuetree.delete(42);
      valuetree.delete(54);
      valuetree.delete(93);
      valuetree.delete(94);
      valuetree.delete(15);
      valuetree.delete(57);
      valuetree.printHorizontal();
      valuetree.search(114);
      valuetree.search(93);
      Node<Integer> root = valuetree.getRoot();
      MultiplyTreeByFive(root);
    }
    public static void MultiplyTreeByFive(Node<Integer> root) {
       if(root!=null) {
  		root.setValue(root.getValue()*5);
  		MultiplyTreeByFive(root.getLeft()); 
  		MultiplyTreeByFive(root.getRight()); 
  		
  	}
        valuetree.printHorizontal();
        valuetree.printVertical();
       }
    }
    /*
    public static void MultiplyTreeByFive(Node<Integer> root) {
        if(root!=null) {
     	boolean notNull =true;
         while (notNull) {
   		root.setValue(root.getValue()*5);
   		root = root.getLeft(); 
   		
   		if(root!=null) {
   			continue;
   		}
   		else {
   			notNull = false;
   		}
   	}
         valuetree.printHorizontal();
         valuetree.printVertical();
        }
     }
     */


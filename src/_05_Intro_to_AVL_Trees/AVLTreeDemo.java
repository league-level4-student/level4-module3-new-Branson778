package _05_Intro_to_AVL_Trees;

import _03_Intro_to_Binary_Trees.BinaryTree;

public class AVLTreeDemo {

    /*
     * An AVLTree is a special BinaryTree that is capable of balancing itself.
     * With a regular binary tree, depending on the elements inserted, you might
     * have a root with one very long right branch and one very long left branch
     * with nothing else in between.
     * 
     * 1.) Read through the AVLNode and AVLTree. Notice that the methods are
     * similar to those in BinaryTree with two important distinctions:
     * done
     * a) Each Node has a balance factor that keeps track of how many levels
     * "down" it is relative to the rest of the tree.
     * done
     * b) There are "rotate" helper methods used when a given node gets too
     * unbalanced(> 1 level out of sync with the rest of the tree) to rotate
     * branches back into place.
     * done
     * 2.) Create a BinaryTree and an AVLTree.
     * done
     * 3.) Insert the same values into both trees and observe how they differ
     * using the print method. Make sure the values you pick unbalance the
     * binary tree.
     * 
     * 4.) Try removing elements from both and see how they change using one of
     * the print methods.
     */

    public static void main(String[] args) {
       BinaryTree<Integer> bintre = new BinaryTree<Integer>();
       AVLTree<Integer> avltre = new AVLTree<Integer>();
       bintre.insert(3);
       bintre.insert(4);
       bintre.insert(13);
       bintre.insert(1);
       bintre.insert(80);
       bintre.insert(8);
       bintre.insert(27);
       bintre.insert(117);
       bintre.insert(49);
       avltre.insert(3);
       avltre.insert(4);
       avltre.insert(13);
       avltre.insert(1);
       avltre.insert(80);
       avltre.insert(8);
       avltre.insert(27);
       avltre.insert(117);
       avltre.insert(49);
       bintre.printVertical();
       avltre.printVertical();
       bintre.delete(80);
       bintre.delete(1);
       avltre.delete(80);
       avltre.delete(1);
       bintre.printVertical();
       avltre.printVertical();
    }

}

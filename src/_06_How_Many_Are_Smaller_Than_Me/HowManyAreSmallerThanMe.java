package _06_How_Many_Are_Smaller_Than_Me;

import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanMe {

    /*
     * Given an AVLTree filled with the random numbers from 1 to 20, and a
     * single number within the AVL Tree, figure out how many numbers in the
     * AVLTree are smaller than the provided number and return the result.
     * 
     * You may want to create a helper method to search through the AVLTree and
     * count iteratively or recursively.
     */
	int steps = 0;
	AVLNode traveler;
    public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
//Using AVLNodes start from the bottom of the AVLTree and move your way until you find the number and count every step.
    	avlTree.printVertical();
    	traveler = avlTree.getRoot();
    	recursiveSearch(me,traveler);
        return steps;

    }
    private int recursiveSearch(int lessThan,AVLNode<Integer> traveler) {
		
    	if(traveler.getValue()<lessThan) {
			steps++;
		}
    	if(traveler.getRight()!=null) {
    		AVLNode traveler2 = traveler.getRight();
			recursiveSearch(lessThan, traveler2);
		}
		else if(traveler.getLeft()!=null) {
			AVLNode traveler3 = traveler.getLeft();
			recursiveSearch(lessThan, traveler3);
		}
		else {
			System.out.println("MOVEMENT ERROR");
			System.out.println(lessThan);
			System.out.println(traveler.getValue());
		}
    	
    	return lessThan;
    	
    }

}

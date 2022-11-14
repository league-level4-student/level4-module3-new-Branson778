package _00_Intro_to_Linked_Lists;

public class LinkedListDemo {

    public static void main(String[] args) {

        /*
         * A LinkedList is a linear data structure, but unlike an ArrayList or
         * Array the data is not stored in contiguous memory locations.
         * 
         * Instead, each data node contains a reference that says where the next
         * node can be found.
         * 
         * Note: In the Node example provided there is also reference that
         * points back to the previous node. This is a referred to as a
         * doubly-linked list.
         * 
         * 1. Read through the LinkedList and Node classes.
         * done
         * 2. Create a LinkedList of any type you like.
         * done
         * 3. Try using some LinkedList methods to add, remove and print a few
         * elements.
         * done
         * 4. Save the head or tail reference into a Node Object and use
         * references to traverse through the list and perform an operation on
         * every element then print the list to see if it worked.
         * 
         * e.g. Multiply every element by something in a LinkedList containing
         * Integer nodes or make word upper case in a LinkedList containing
         * String nodes.
         * 
         */
       LinkedList<Integer> list = new LinkedList<Integer>();
       list.add(14);
       list.add(17);
       list.add(-97);
       list.print();
       list.remove(2);
       list.add(71);
       list.add(21);
       list.add(13);
       list.add(41);
       list.add(19);
       list.print();
       //quick edit because of an error
    }

}

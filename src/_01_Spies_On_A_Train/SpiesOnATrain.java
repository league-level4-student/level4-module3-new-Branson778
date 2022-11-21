package _01_Spies_On_A_Train;

import java.util.ArrayList;
import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

    /*
     * A spy has made off with important intel from your intelligence agency!
     * You know the spy is somewhere on this train(LinkedList). Your job is to
     * find the suspect that matches the description given to you by the list of
     * clues(the array).
     * 
     * Walk through the train, questioning each of the passengers about what
     * they have seen and return the name of the most likely suspect.
     * 
     * The results are randomly generated each time so you should have a general
     * case solution that carefully compares the clues to each passenger's
     * testimony. Remember to use String methods to break up the passengers'
     * statements.
     */
    String findIntel(LinkedList<TrainCar> train, String[] clues) {
       String spy = "";
       ArrayList<String> collected = new ArrayList<String>();
       ArrayList<String> phone = new ArrayList<String>();
       ArrayList<String> pie = new ArrayList<String>();
       ArrayList<String> briefcase = new ArrayList<String>();
       Node<TrainCar> current = train.getHead();
    	for (int i = 0; i < train.size(); i++) {
       	String temp = current.getValue().questionPassenger();
       	System.out.println(temp);
       	collected.add(temp);
       	current = current.getNext();
	}
    	StringBuilder sorter;
    	System.out.println("TESTING");
    	for (int i = 0; i < collected.size(); i++) {
			String temp = collected.get(i).toString();
			sorter = new StringBuilder(temp);
			if(sorter.indexOf("phone",0)!=-1) {  //if statement sorting out phone clues
				phone.add(collected.get(i).toString());
				System.out.println("PHONE ADDED AT "+ i);
			}
			else if(sorter.indexOf("pie",0)!=-1) {  //if statement sorting out pie clues
				pie.add(collected.get(i).toString());
				System.out.println("PIE ADDED AT "+i);
			}
			else if(sorter.indexOf("briefcase",0)!=-1) {  //if statement sorting out briefcase clues
				briefcase.add(collected.get(i).toString());
				System.out.println("BRIEFCASE ADDED AT "+i);
			}
			else {
				System.out.println("ERROR ADDING AT "+i);
			}
		}
    	System.out.println("");
        return spy;

    }

}

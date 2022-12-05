package _01_Spies_On_A_Train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

	/*
	 * A spy has made off with important intel from your intelligence agency! You
	 * know the spy is somewhere on this train(LinkedList). Your job is to find the
	 * suspect that matches the description given to you by the list of clues(the
	 * array).
	 * 
	 * Walk through the train, questioning each of the passengers about what they
	 * have seen and return the name of the most likely suspect.
	 * 
	 * The results are randomly generated each time so you should have a general
	 * case solution that carefully compares the clues to each passenger's
	 * testimony. Remember to use String methods to break up the passengers'
	 * statements.
	 */
	String findIntel(LinkedList<TrainCar> train, String[] clues) {
		String spy = "";
		ArrayList<String> testimonies = new ArrayList<String>();
		ArrayList<String> keys = new ArrayList<String>();
		HashMap<String,Integer> suspects = new HashMap<String,Integer>();
		StringBuilder sorter = new StringBuilder();
		Node<TrainCar> current = train.getHead();
		for (int i = 0; i < train.size(); i++) {
			String temp = current.getValue().questionPassenger();
			testimonies.add(temp);
			current = current.getNext();
		}
		for (int i = 0; i < testimonies.size(); i++) {
			sorter = new StringBuilder(testimonies.get(i).toString());
			for (int j = 0; j < clues.length; j++) {
				if (sorter.indexOf(clues[j], 0) != -1) {
					int clueIndex = sorter.indexOf(clues[j], 0);
					int nameIndex = sorter.indexOf("saw",0)+3;
					String name = testimonies.get(i).substring(nameIndex, clueIndex).trim();
					if(suspects.get(name)==null) {
						suspects.put(name, 1);
					}
					else {
						suspects.replace(name, suspects.get(name)+1);
					}
					keys.add(name);
				}
			}

		}
		int topMatch = 0;
		for (int i = 0; i < suspects.size(); i++) {
			if(suspects.get(keys.get(i))>topMatch) {
				topMatch = suspects.get(keys.get(i));
				spy = keys.get(i);
			}
		}
		//System.out.println(releventClues.toString());
		return spy;

	}

}

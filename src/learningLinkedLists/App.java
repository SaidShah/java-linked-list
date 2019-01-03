package learningLinkedLists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {

		String fruit[] = { "apples", "pear", "watermelon", "peach", "plum", "banana", "melon", "persimmon",
				"starfruit" };// array of strings
		List<String> fruitList = new LinkedList<String>();// initializing a linked list
		for (String fruits : fruit) {// adding all of the items from the array to the linked list
			fruitList.add(fruits);
		}

		String names[] = { "john", "adam", "james", "sayed", "michael", "obama" };
		List<String> nameList = new LinkedList<String>();
		for (String peoplesNames : names) {
			nameList.add(peoplesNames);
		}

		fruitList.addAll(nameList);

		nameList = null;

		System.out.println("Printing the list after joining both lists");
		printMe(fruitList);// prints the list
		System.out.println();
		
		
		System.out.println("printing the list after removing some items");
		removeStuff(fruitList, 2, 4);// removes items from x index to x index
		printMe(fruitList);// prints the list
		System.out.println();
		
		
		System.out.println("printing the list after reversing it ");
		reverseMe(fruitList);// reverses the list

	}

	private static void printMe(List<String> tempList) {
		for (String things : tempList) {// putting the items in an advanced for loop to print them out
			System.out.printf("%s, ", things);

		}
		System.out.println();
	}

	private static void removeStuff(List<String> tempList, int fromIndex, int toIndex) {
		tempList.subList(fromIndex, toIndex).clear();// makes a sublist from the from and to index and then clears them

	}

	private static void reverseMe(List<String> tempList) {
		ListIterator<String> tempListToReverse = tempList.listIterator(tempList.size());// uses a list iterator to go
																						// through the list starting
																						// from the end
		while (tempListToReverse.hasPrevious()) {// checks to see if there is something in the previous
			System.out.printf("%s, ", tempListToReverse.previous());// prints whatever is in the previous index
		}

	}

}

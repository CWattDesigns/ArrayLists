package output;

import java.util.*;

public class ArrayListOutput {

	public static void main(String[] args) {
		//Declare an ArrayList of Strings
		ArrayList<String> namesArrayList = new ArrayList<>();
		
		//Add names to the ArrayList
		Collections.addAll(namesArrayList, "Chris", "Michael", "Steven", "Samson", "Bob", "Susan", "Sam", "Alex");
		
		//Print ArrayList using for loop
		for (String nm : namesArrayList) {
			System.out.println(nm);
		}
		
		//Sort ArrayList
		Collections.sort(namesArrayList);
		System.out.println("\r\n" + namesArrayList);
		
		//Shuffle ArrayList
		Collections.shuffle(namesArrayList);
		System.out.println("\r\n" + namesArrayList);
		
		//Search for a name in the ArrayList
		System.out.println("\r\n" + namesArrayList.indexOf("Chris"));
		
		//Search for a name NOT in the ArrayList
		System.out.println("\r\n" + namesArrayList.indexOf("Shelby") + "\r\n");
		
		//Convert ArrayList into an Array and output elements
		Object [] objects = namesArrayList.toArray();
		for (Object obj : objects) {
			System.out.print(obj + " ");
		}
		
		//Convert Array back to ArrayList and output elements
		List updatedArrayList = Arrays.asList(objects);
		System.out.println("\r\n" + updatedArrayList);
	}

}
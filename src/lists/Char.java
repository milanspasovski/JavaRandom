package lists; 
import java.util.*;


public class Char {

	public static void main(String[] args) { 
		//create array and convert to list
		Character [] c = {'p', 'w', 'n'}; 
		List<Character> l = Arrays.asList(c); 
		System.out.println("List is: "); 
		output(l); 
		
		//reverse and print out the list
		Collections.reverse(l);
		System.out.println("After reverse: ");
		output(l); 
		
		//create a new array and a list 
		Character[] cc = new Character[3];  
		List<Character> listCopy = Arrays.asList(cc); 
		
		//copy list into listCopy
		Collections.copy(listCopy, l); 
		System.out.println("Copy of list: "); 
		output(listCopy); 
		
		//fill collection 
		Collections.fill(l, 'X');
		System.out.println("After filling the list: "); 
		output(l);
		

	} 
	private static void output(List<Character> thelist) { 
		for(Character x:thelist)
			System.out.printf("%s ", x); 
		System.out.println();
	}

}

package lists;
import java.util.*;


public class LinkedL {

	public static void main(String[] args) {
		String [] hello = {"hello", "is", "there", "anybody", "in", "there"}; 
		List<String> l1 = new LinkedList<String>(); 
		for(String x:hello)
			l1.add(x);  
		
		String [] hello2 = {"just", "nod", "if", "can", "hear", "me"}; 
		List<String> l2 = new LinkedList<String>(); 
		for(String y:hello2)
			l2.add(y); 
		
		l1.addAll(l2); 
		l2 = null; 
		
		printMe(l1); 
		removeMe(l1, 2, 5); 
		printMe(l1); 
		reverseMe(l1);
		
	} 
	//printMe
	public static void printMe(List<String> l) { 
		for(String x:l)
			System.out.printf("%s ", x); 
		System.out.println();
	} 
	//removeMe
	public static void removeMe(List<String> l, int from, int to) { 
		l.subList(from, to).clear();
	} 
	//reverseMe
	public static void reverseMe(List<String> l) { 
		ListIterator <String> li = l.listIterator(l.size());  
		while(li.hasPrevious())
			System.out.printf("%s ", li.previous());
	}

}

package lists; 
import java.util.*;


public class HashSetM {

	public static void main(String[] args) {
		String[] things = {"hello", "bye", "apples", "bye","bye", "hi"}; 
		List<String> list = Arrays.asList(things); 
		
		System.out.printf("%s ", list); 
		System.out.println(); 
		
		Set<String> set = new HashSet<String>(list);  
		System.out.printf("%s ", set);
	}

}

package lists; 
import java.util.*;


public class GenericM {

	public static void main(String[] args) {
		Integer [] iray = {1,2,3,4}; 
		Character[] cray = {'a','b','c','d'}; 
		
		printMe(iray); 
		printMe(cray); 
		 		
	} 
	//generic method 
	public static <T> void printMe(T[] i) { 
		for(T x:i)
			System.out.printf("%s ", x); 
		System.out.println();
	}

}

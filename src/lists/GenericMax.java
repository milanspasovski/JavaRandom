package lists; 
import java.util.*;


public class GenericMax {

	public static void main(String[] args) { 
		System.out.println(max(22,11,38)); 
		System.out.println(max("hello", "apples", "hi"));
		

	} 
	
	public static <T extends Comparable<T>> T max(T a, T b, T c){ 
		T m=a; 
		if(b.compareTo(a)>0)  
			m=b; 
		
		if(c.compareTo(m)>0) 
			m=c; 
		return m;
			
	}

}

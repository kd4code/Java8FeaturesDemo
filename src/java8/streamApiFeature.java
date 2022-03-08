/*
 * Mainly we use to create stream for Collections & Array
 * for Collection, Collection.stream() method is used 
 * for Array, Arrays.stream(instance of Array)
 * Its not possible to operate a stream mutiple time, it throws IllegalStateException.
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApiFeature {
	
	public static void main(String[] args) {
		List<Integer> lt=new ArrayList<>();
		Collections.addAll(lt,10,30,15,45,60);
		Stream<Integer> st=lt.stream();
		Stream<Integer> st1=st.filter(i->i%2!=0);
	//	Stream<Integer> st2=st.filter(i->i%2!=0);  //this statement throw Exception as stream is operated again
	  //  st1.forEach(i->System.out.println(i));
		List<Integer> al=st1.collect(Collectors.toList());//creating a list from Stream
	    al.forEach(i->System.out.println(i));
	    
	}

}

package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
/* 
 *Iterate method of Stream Interface ,Iterate(initial value,method of condition,method of increment/decrement)
 *Another Iterate method with two parameters only,iterate(initial value,method of increment/decrement)
 *Stream.Iterate is static method of Stream Interface, which is mainly work as for loop, while loop
 */
public class StreamIterate {

  public static void main(String[] args) {
	List<Integer> al=new ArrayList<>();
	Collections.addAll(al,10,15,20,30,50,25,65);
	System.out.println("Main Started");
	Stream<Integer> st=al.stream();
	Iterator<Integer> itr=st.iterator();
//	Iterating by iterate(initial value,method for next value of element)
	Stream.iterate(1,num->num<10,num->num+1).filter(num->num*num>25).forEach(i->System.out.print(i*i+" "));
	System.out.println();
	Stream.iterate(1,i->i<15,i->i+1).filter(i->i<10).forEach(i->System.out.print(i+" "));
	System.out.println();
	System.out.println("Main Ended");
	
}
}

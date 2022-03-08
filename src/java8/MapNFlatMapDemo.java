package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Map(): It is an intermediate stream method
 * Function passed in map(), consider every element in stream individually plus operates & returns a new stream
 * FlatMap(): It is also an intermediate stream method,it is used for Stream of multiple collections/arrays.
 * Function passed in FlatMap(), effects individually to each collection present in stream 
 * as a return , it gives merged stream of all elements present in each collection of stream
 */
public class MapNFlatMapDemo {
	public static void main(String[] args) {
	//************MAP()***************************	
		List<Integer> al=new ArrayList<>();
		Collections.addAll(al,10,20,30,40);
		System.out.println("Given List: "+al);
		List<Integer> mapAl=al.stream().map(num->num*3).collect(Collectors.toList());
		System.out.println("After Map: "+mapAl);
		
   //***************FLATMAP()**************************
		List<List<Integer>> al1=new ArrayList<>();
		al1.add(Arrays.asList(1,2));
		al1.add(Arrays.asList(3,4));
		al1.add(Arrays.asList(5,6));
		
		List<Integer> flatMap=al1.stream().flatMap(List->List.stream()).collect(Collectors.toList());
		List<Integer> flatMap1=al1.stream().flatMap(List->List.stream().filter(num->num%2==0)).collect(Collectors.toList());
		System.out.println("FlatMap: "+flatMap);  //output: FlatMap: [1, 2, 3, 4, 5, 6]
		System.out.println("FlatMap: "+flatMap1); //output: FlatMap: [2, 4, 6]
   
   //*****************Map() for String collection*********
		List<String> stl=new ArrayList<>();
		Collections.addAll(stl,"Pune","Mumbai","Tokyo","Berlin","Nairobi");
		
		List<Character> ct=stl.stream().map(st->st.charAt(0)).collect(Collectors.toList());
		System.out.println(ct);// output: [P, M, T, B, N]
		
	}

}

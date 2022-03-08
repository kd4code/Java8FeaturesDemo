
/*
 *forEach is only valid for collection & stream 
 *It is from Iterable Interface
 *forEach(Consumer action) , forEach Method accepts Consumer i.e a Functional Interface with abstract method accept()
 *
 */
package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class forEachFeature {

	public static void main(String[] args) {
		List<Integer> lt = new ArrayList<>();
		for (int i = 0; i < 5; i++)
			lt.add(i * 10);

//***Created a Consumer reference with type of element in collection ,by Anonymous class Object 		
//        Consumer<Integer> c=new Consumer<Integer>() {
//		       public void accept(Integer i)
//		       {
//		    	 System.out.println(i*2);  
//		       }
//        };
//		lt.forEach(c);  //used the reference of Consumer in forEach Method

//***Directly created Anonymous Class Object in forEach Method 		
//        lt.forEach(new Consumer<Integer>() {
//		       public void accept(Integer i)
//		       {
//		    	 System.out.println(i*2);  
//		       }
//     });

//***Directly by lambda Expression to implement the abstract method i.e. accept()		
		lt.forEach(i -> {
			System.out.println(i * 2);
		});
	}
}

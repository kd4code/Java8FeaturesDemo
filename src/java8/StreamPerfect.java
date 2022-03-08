package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamPerfect {
  
	public static void main(String[] args) {
//		List<Integer> al=new ArrayList<>();
//		Collections.addAll(al,1,2,5,7,9);
//		Stream<Integer> st=al.stream();
//		st.filter(num->num*num>25).forEach(num->{System.out.println(num*num);});
		int n=28;
		Stream<Integer> st1=Stream.iterate(1,j->j<=n/2,i->i+1).filter(num->n%num==0);
        Integer sum=st1.reduce(0,Integer::sum);
     //   System.out.println(sum);
        if(sum==n)
        	System.out.println("Perfect Number");
        else
        	System.out.println("Not Perfect Number");
//**************************************************************************************       
//        Integer[] arr= {10,20,30,40,50};
//        Stream<Integer> st=Arrays.stream(arr);
//       Iterator itr=st.iterator();
//       while(itr.hasNext())
//       {
//    	 System.out.println(itr.next());   
//       }
//        
        Stream<Integer> st2=Stream.iterate(8,i->i%2==0,i->i+10);//.filter(i->i%4==0);
        st2.forEach(i->System.out.print(i+" ")); 
        //.forEach(i->System.out.println(i));
        
	}
}

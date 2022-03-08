package java8;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamHighestNum {
   public static void main(String[] args) {
	int[] a= {1,5,2,7,4,9,3};
	IntStream st=Arrays.stream(a);
//*****************************************************************
	//HIGHEST NUMBER IN STREAM
	OptionalInt i=st.max();
	int n=i.getAsInt();
	System.out.println("Highest :"+n);
//*****************************************************************
	//2ND HIGHEST NUMBER IN STREAM
    IntStream st1=Arrays.stream(a);
    int n1=st1.filter(j->j!=n).max().getAsInt();
    System.out.println("2nd Highest :" +n1);
   }
}

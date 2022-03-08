package java8;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		String[] str= new String[5];
		str[2]="AAAAA";
		
		//if exist return optional object or if not then NullPointerException,its static
		Optional<String> value=Optional.of(str[2]);
		
		//if exist return optional object or if not then empty optional object,its static
		Optional<String> value1=Optional.ofNullable(str[2]);
		
		//get() is used to get exact value from optional object, its not static method
		//if value is there, it reads the exact value & return
		//if value is empty , it throws NoSuchElementException
		System.out.println(value1.get());
		
		//it checks,optional object is empty or not, its not static method
		System.out.println(value.isEmpty());
		//it checks ,value in optional object is present or not 
		System.out.println(value.isPresent());
	}

}

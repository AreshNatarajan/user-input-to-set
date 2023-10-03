package org.practice;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class UserInputAndAdd {

	public static void main(String[] args) {
		
		Set<String> input =new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the user name if you want exit(stop)");
			String names = sc.nextLine();
			
			if(names.equalsIgnoreCase("stop")) {
				break;
			}
			
			input.add(names);
			
		}
		
		System.out.println("User Input !");
		for(String inputs:input) {
			System.out.println(inputs);
		
		} 
	}

}

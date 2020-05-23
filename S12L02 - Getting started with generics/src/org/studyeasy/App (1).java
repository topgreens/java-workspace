package org.studyeasy;

import java.util.ArrayList;
import java.util.Iterator;

class GenericClass<T>{
	private T variable;

	public GenericClass(T variable) {
		this.variable = variable;
	}

	@Override
	public String toString() {
		return "GenericClass [variable=" + variable + "]";
	}

	public T getVariable() {
		return variable;
	}
	
}
 
public class App {

	private static GenericClass<Integer> test;

	public static void main(String[] args) {
		
		//System.out.println(new GenericClass<String>("Some text"));
		//System.out.println(new GenericClass<Double>(2.0));
		//System.out.println(new GenericClass<Character>('#'));
		
		ArrayList<GenericClass> list = new ArrayList<>();
		list.add(new GenericClass<Integer>(1));
		list.add(new GenericClass<Integer>(2));
		list.add(new GenericClass<String>("String"));
		list.add(new GenericClass<Integer>(4));
		list.add(new GenericClass<Integer>(5));
		list.add(new GenericClass<Integer>(6));

		
		for(GenericClass i:list){
			
		}
	}	
}















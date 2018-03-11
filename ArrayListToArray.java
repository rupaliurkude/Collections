package com.qa.Collections;

import java.util.ArrayList;

public class ArrayListToArray {

	private static final String Array = null;

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		Object  o[] =al.toArray();
		//Printing all array
		for(Object obj:o){
			System.out.println(obj);
		}
	}

}

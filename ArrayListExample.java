package com.qa.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		//searching 
		System.out.println(" Search"+al.get(2));
		//iterating using iterator.
		Iterator it =al.iterator();
		 while(it.hasNext()){
		Object element = it.next();
		 System.out.print(","+element);
		 
		 } 
		 //Reverse
		 System.out.println("");
		 ListIterator<Integer> itr = al.listIterator(al.size());
		 while(itr.hasPrevious()){	 
			 System.out.print(","+itr.previous());
		 }
		 
		}

	}


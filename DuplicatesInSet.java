package com.qa.Collections;

import java.util.*;

public class DuplicatesInSet {
	public static void main(String[] args) {
		int set [] ={10,20,20,30,50,60};
		TreeSet<Integer> unique = new TreeSet<Integer>();
		
			for(int sets : set){
				if(!unique.add(sets)){
				 System.out.print("Duplicate:"+unique);
				}
			}
		
		}

	}



package com.qa.Collections;

public class inputSeries {
	String input1 [] ={"a1","a2","a3","a4","a5","a6","a7"};
	String input2 [] ={"b1","b2","b3","b4","b5","b6","b7"};
	String input3 [] = new String[input1.length+input2.length];
	int k=0;
  	public void mergeInputs(){
  		for(int i=0,j=0;i<input1.length || j<input2.length;){
  					input3[k++]=input1[i++];		
  					input3[k++]=input2[j++];
  					
  		}
  		for(int k=0;k<input3.length;k++){
  			System.out.print(input3[k]);
  			}
  	}		
  		
  	public static void main(String[]arg){
  		inputSeries is = new inputSeries();
  		 is.mergeInputs();
  	}
  		
}	
  		
  	

	
 		

 	
 	
 	

	

package com.qa.Collections;

public enum Month {
	JAN,FEB,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;

	public static void main(String[]arg){
		Month m = Month.FEB;
		switch(m){
		case JAN:	
		System.out.println("this is Jan");
		break;
		case FEB:
			System.out.println("this is Feb");
		break;
		case MARCH :
			System.out.println("this is Feb");
		break;
		case APRIL:
			System.out.println("this is MARCH");
		break;
		case MAY:
			System.out.println("this is APRIL");
		break;
		case JUNE:
			System.out.println("this is MAY");
		break;
		case JULY:
			System.out.println("this is JUNE");
		break;
		case AUGUST:
			System.out.println("this is JULY");
		break;
		case SEPTEMBER:
			System.out.println("this is AUG");
		break;
		case OCTOBER:
			System.out.println("this is SEB");
		break;
		case NOVEMBER:
			System.out.println("this is NOV");
		break;
		case DECEMBER:
			System.out.println("this is DEC");
		break;
		}
		for(Month months:Month.values()){
			System.out.print(months+", ");
}
	}

}
 
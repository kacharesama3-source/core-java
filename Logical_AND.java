package Datatypes;

public class Logical_AND {

	public static void main(String[] args) {
		//in logical AND both condition true  otherwise false 
		// "=" => assignment operator
		//"==" =>Relational operator
		// "!=" => Relational  
		// logical  operators (ANS,&& // OR ||||)
		
		
		System.out.println(true&&true);// true
		System.out.println(true && false);//false
		System.out.println(false&& false);//false
		System.out.println(false&&true);//faslse
		int a=123;
		int b=345;
		System.out.println( "*****************************************" );
		System.out.println(a>120&&b<400); //T&&T =>T
		System.out.println(a<90&& b>390);//F &&F =>F
		System.out.println(a<200&& b>346);//T&&F=>F
		System.out.println(a>150&& b>340);//F&&T=>F
		// if else loop
		if ( a>120 && b<460)
			System.out.println(true);
		else
			System.out.println(false);
		//while loop => both condition true then output true
		
		     int i  = 1;
		     while (i<=10 && i%2==1)
		    	 System.out.println("i-"+i);
		     i+=2;
		     
		        
		    }
		}

		

	
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
		

	}

}

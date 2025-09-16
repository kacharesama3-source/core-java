package Datatypes;

public class Logical_OR {

	public static void main(String[] args) {
		// logical or (||) atleast one condition true
		// if first condition true javsa does not check second condition
		int a= 30;
		int b=34;
		int c=37;
		
		System.out.println(a>40 || b<50);// f||t =.T
		
		System.out.println(a<20||b>35||c<40 );// F||F||T=>T
		// condition statement  
		//control alter t command
		//1) if else condtion
		if(a>=20|| b<=50||c <=40) {
			System.out.println("conditioon passed");
			
		}
		else {
			System.out.println("condition false");
		}
		System.out.println("**********THE END**************");
		
	}

}

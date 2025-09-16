package Datatypes.Conditional_statements;

public class Nested_and {

	public static void main(String[] args) {
		int sal= 23000;
		int sal2 =25000;
		int sal3 =27000;
		
		// in and both condition true then o/p true
		// 250000+
	
		if (sal<=25000&& sal2<=25000 && sal3>=250000  ) {
			System.out.println("true");
		}
		else {
			System.out.println("condition false");
		}
			if ( sal2>=25000 || sal >=25000) {
				System.out.println("condition true");
			}
			else {
				
				System.out.println("condition false");
			}
		   System.out.println("********* THE END****************");
		}
	}


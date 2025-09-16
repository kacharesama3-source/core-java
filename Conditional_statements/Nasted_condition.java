package Datatypes.Conditional_statements;


public class Nasted_condition {

	public static void main(String[] args) {
		 int num =45;
		 int num2=49;
		 int num3=48;
		 // 46+
		 if(num>=46||num2>=46 && num3>=46)
            // F||T&&T=>  T
		 {
			 System.out.println("yes");
			if(num2>=46) {
				System.out.println("true");
			}
				else {
					System.out.println("not passed");
				}
				if (num3>=46) {
					System.out.println("conditions passed");
					
				}
			else {
				System.out.println("conditons failed");
			}
		 }
		 else {
			 System.out.println("not");
		 }
	}

}

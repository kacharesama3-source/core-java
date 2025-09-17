package Datatypes.loops;

public class Primenum2to100 {

	public static void main(String[] args) {
		for(int i=2; i<100;i++) { // outer loop: check  the 2 to 99 number
			boolean flag =true; // if i is true ,then it is prime number
			for(int j=2; j<i;j++) { // inner loop :division
			
				if(i%j==0) {
					flag=false;
					
				}
			} if(flag==true) {
				System.out.println("prime:"+i);
			}
		}
	}

}

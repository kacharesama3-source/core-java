package Datatypes.loops;

public class Sum {

	public static void main(String[] args) {
		double sum =0;
	for (int num=1;num<=1000;num++) {
		if(num%13.5==0) {
			System.out.println(num);
			sum=sum+num;
		}
	}  
	System.out.println(sum);
	System.out.println("****Code end");
	}

}

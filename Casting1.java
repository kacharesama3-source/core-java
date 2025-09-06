package Datatypes;

public class Casting1 {

	public static void main(String[] args) {
	//	narrowing ,explicit casting  
		double d = 12.35; //64 bit 
		//System.out.println(d);
		int age = (int)d; // 32 bit  
		System.out.println(age);
		 
		
		//wideing,implicit casting
		int num = 305;
		System.out.println(num);
		float s= num;
		System.out.println(s);
	}

}

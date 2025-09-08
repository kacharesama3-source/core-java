package Datatypes;

public class Relationaloperation {

	public static void main(String[] args) {
      System.out.println("hello baby");
       int a = 23;
        int b= 56;
        double  c =70;
        double d =30.345;
        String s = "samadhan"; // always in double quotes 
        // primitive data types 
        System.out.println("a+b ="+ (a+b));
        System.out.println("a-b+c ="+ (a-b+c));
        System.out.println("a*b="+(a*c));
        System.out.println("c/b="+(c/b));
         System.out.println(d);
         int i = (int)d;
         System.out.println(i);
         System.out.println(a);
         double d1 = a;
         System.out.println(d1);
         // pre and post increment, decrement  
         ++a; // 24
         ++b; // 57
         c++; // 70 => 71
         ++d; // 31.345
         d--; // 31.345=> 30.345
         System.out.println(a+ ++b +c-- +d ++ + -- a + c++);
                          // 24+ 58+ 71=>70 +30.345=> 31.345+ 23+70 =>71
        System.out.println( 24+ 58+ 71 +30.345+ 23+70 );
        System.out.println(d);
        System.out.println(b);
        // logical operation 
        System.out.println(a>20 && c<80);
        System.out.println(d<20 || c>80);
        System.out.println(! (a>80));
        // special case  
        System.out.println(a + b +s);
        System.out.println(s+ a+b+c+d);
        //  non primitive data types
         String  [] arr = new String  [5];// data type(String) then array([]) and then variable name (arr)
         arr [0]= "samadhan";
         arr [1]= "2345";
         arr [2]="2345.34567";
         arr [3]= "@";
         arr[4]="2345678.34567";
        System.out.println(arr[0]+ arr[3]);
        // for loop
        
      int[] numbers = {10, 20, 30, 40, 50};
       for (i= 0; i < numbers.length; i++) 
        	System.out.println(numbers[i]);
       double[] bank = {12.23,23,56,67.78,89,48};
       for ( i=0; i<bank.length; i++)
    	   System.out.println(bank[i]);
         
     
         
         
         
      

	}

}

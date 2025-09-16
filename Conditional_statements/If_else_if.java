package Datatypes.Conditional_statements;

public class If_else_if {
   // use if_else_if when more than two more conditions need check to be checked
	// conditions check in order  
	// once a condition check is true , remaing checks at skipped 
	public static void main(String[] args) {
	       int mark = 75;
	      if  (mark>=90) {
	    	  System.out.println("Grade: A+");
	      }else if(mark>=75) {
	    	  System.out.println("Grade: A");
	      } else if (mark>=50) {
	    	  System.out.println("Grade:B");
	    	  
	      }else {
	    	  System.out.println("Grade:c");
	      }
	        System.out.println("********* the end***************");
		

	}

}

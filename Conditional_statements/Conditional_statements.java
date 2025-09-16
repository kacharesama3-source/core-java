package Datatypes.Conditional_statements;

public class Conditional_statements {

	public static void main(String[] args) {
		int sal=2000;
		int sal2=4000;
		int sal3=6000;
		System.out.println(sal>sal2);
		System.out.println(sal<=sal2);
       // if else conditions , in if only check given conditions is true or false then go two down if condition false then they goes to else 
		// in conditional statement => out put of relation statement is input of condition statement 
		// if block must be used relational and logical operators
		if(sal>=sal2 || sal2>=sal3) {
			System.out.println("correct condition");
		}
		else {
			System.out.println("incorrent condition");
			
		}
		if(sal<=sal2&& sal2<sal3) {
		System.out.println("condition passsed");
	}
		else {
			System.out.println("not passed");
		}
		System.out.println("*************program exicuted****************");
	}


	}



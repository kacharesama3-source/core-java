package Datatypes;

public class arithmatic {

	 
		public static void main(String[] args) {
			int age =34;
			//System.out.println(age);
			++age; //=35 // in pre increment first then used in expreesion
			age++; // =35=>36 in post used current value the increment by 1
		   System.out.println(age++ +(++age)+ ++age);
		                  // 36+38+39=113
		   System.out.println(age);	// print total value of age ,after perform of operand
//			pre and post drecrement
			double  num = 123.35 ;
			 --num ; //=122.35
			num--; //122.35=>121.35
			System.out.println(num+ --num +num-- + --num );
			                 //121.35+120.35+120.35+118.35=>480.35 num=118.35
			System.out.println(121.35+120.35+120.35+118.35);
			//System.out.println(num-- +100);
			//System.out.println(--num +num++ +100 );
			                 // 117.35 +117.35 +100 =334.7
			//System.out.println( 117.35 +117.35 +100);
			System.out.println(117.35+100+117.35+118.35); 
			//System.out.println(--num +100 +num++ +num--);
			                  // 117.35+100+117.35+118.35
		
		
		   

	}

}

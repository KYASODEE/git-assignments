package ExceptionHandling2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unsupportedoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		   
		String str[]= {"Apple","Banana"};
			       List<String> list=Arrays.asList(str);
			       List<String> l=new ArrayList<>(list);
			       
			       l.add("Mango");
			       for(String s:l)
			    	   System.out.println(s);
				// TODO Auto-generated method stub

			}
}

		

	



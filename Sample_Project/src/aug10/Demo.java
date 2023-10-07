package aug10;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// store integer type into array collection
		int x[]=new int[5];
		x[0]=100;
		x[1]=200;
		x[2]=400;
		x[3]=600;
		x[4]=900;
		//print length of array
		System.out.println(x.length);
		//print specific element position in array collection
		System.out.println(x[4]);
		//print each position value in 
		for (int each : x) {
			System.out.println(each);			
		}
		

	}

}

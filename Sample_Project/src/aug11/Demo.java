package aug11;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// store car collection into array list  class
		ArrayList<String> cars =new ArrayList<String>();
		cars.add("Tatapunch");
		cars.add("TataNexon");
		cars.add("Tatatigor");
		cars.add("Tataharrier");
		cars.add("Tatasafari");
		cars.add("Mahindra");
		//print collection numbers
		System.out.println(cars.size());
		//print specific element position value in collection
		System.out.println(cars.get(4));
		for(int i=0; i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}

	}

}

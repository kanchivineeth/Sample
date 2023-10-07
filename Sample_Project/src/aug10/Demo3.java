package aug10;

public class Demo3 {

	public static void main(String[] args) {
		// store different data types
		Object x[]=new Object[5];
		x[0]="Hello";
		x[1]=100;
		x[2]=350.23;
		x[3]="Hello";
		x[4]="b";
		x[5]=true;
		for (Object each : x) {
			System.out.println(each);
		}
		

	}

}

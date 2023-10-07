package aug11;

public class Demo1 {

	public static void main(String[] args) {
		// string functions length()
		String str="I want to get job in to MNC with 15L package";
		System.out.println(str.length());
		//2)equals,equals Ignore case()
		String str1="Hello";
		String str2="Selenium";
		String str3="Hello";
		String str4="HELLO";
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equalsIgnoreCase(str4));	
	}

}

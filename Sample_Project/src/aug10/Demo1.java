package aug10;

public class Demo1 {

	public static void main(String[] args) {
		// store login data into array
		String str[][]=new String[5][2];
		//five rows two cells
		str[0][0]="Admin1";
		str[0][1]="test1";
		str[1][0]="Admin2";
		str[1][1]="test2";
		str[2][0]="Admin3";
		str[2][1]="test3";
		str[3][0]="Admin4";
		str[3][1]="test4";
		str[4][0]="Admin5";
		str[4][1]="test5";
		//print row length
		System.out.println(str.length);
		//print cell length in any row
		System.out.println(str[0].length);
		//print test5 from array
		System.out.println(str[4][1]);
		//iterate all rows
		for (int i=0;i<str.length;i++)
		{
			//iterate all cells
			for (int j=0;j<str[i].length;j++)
			{
				System.out.println(str[i][j]+"\t");
			}
			System.out.println();
					
		}
	}

}

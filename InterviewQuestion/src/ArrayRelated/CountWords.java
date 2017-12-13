package ArrayRelated;

import java.util.Scanner;


public class CountWords {

	public static void main(String[] args) {
		String str;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Tell me your Stirng ? ");
		int count=0;
		str = sc.nextLine();
		System.out.println("Character you want to search ?");
		String searchStr = sc.nextLine();
		char[] chrArray = str.toCharArray();
		for (int i = 0; i < chrArray.length; i++) {
			if(chrArray[i] == searchStr.toCharArray()[0] )
			{
				count++;
			}
		}
		System.out.println("Number of times it appears :"+count);
	} 
	
}

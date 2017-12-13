package ArrayRelated;

public class RemoveDuplicate 
{
	public static void main(String[] args) {
		
		int[] arr = new int[]{2,2,3,1,4,5,1,10};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j])
				{
						arr[j]=-1;
				}
			}
		}
		System.out.println("array without duplicate is  :");
		for (int j = 0; j < arr.length; j++) {
			if(!(arr[j]==-1))
			{
				System.out.println(arr[j]);
			}
		}
	}
}

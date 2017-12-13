package ArrayRelated;

public class SamllestLargestNumer 
{
	
	public static void main(String[] args) {
		int[] arr = {3,4,1,4,1,4,100};
		
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<smallest)
				smallest = arr[i];
		}
		System.out.println("Smallest number is  : "+smallest);	
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest){
				largest=arr[i];
			}
		}
		System.out.println("Largest number is  :"+largest);
	}
}

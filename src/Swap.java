
public class Swap {

	public static void main(String[] args) {
		int[] arr= {10,20,5,70};
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
	        end--;
	        
		}
		for(int values :arr)
		{
			System.out.println(values);
		
		}	
	}

}

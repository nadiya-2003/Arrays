
public class Sort {

	public static void main(String[] args) {
	boolean isSort=false;
	int[] arr= {10,20,30,40};
	
	for(int i =0; i< arr.length-1;i++)
	{
		if(arr[i]<arr[i+1])
		{
		isSort=true;
		}
		else
		{
			isSort=false;
		}
	}
	System.out.println(isSort);
	 if(isSort==true)
	{
	System.out.println("Sorted Array");
		
	}
	 else
	 {
		 System.out.println("UnSorted Array");
	 }
	}
	}




public class ArrayOnes {

	public static void main(String[] args) {
		int[] arr= {1,1,0,0,1,1};
		int[] temp= new int[6];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if( arr[i]==1)
			{
				temp[j]=1;
				j++;
				
			}
//			else
//			{
//				temp[j]=0;
//			}
		}
		for( int values: temp)
		{
			System.out.print(values+" " );		
			}
	}

}

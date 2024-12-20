public class MinMax {

    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 9, 15};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];  
            }
            if (arr[i] < min)
            {
                min = arr[i]; 
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}

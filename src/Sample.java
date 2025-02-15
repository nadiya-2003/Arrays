public class Sample {

    public static void main(String[] args) {
      
        int[] arr = {10, 20, 5, 30, 15};
        int largest = arr[0]; 
        int smallest = arr[0];
        int sum = 0;           
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];  
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of elements: " + sum);
    }
}

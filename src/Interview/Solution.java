package Interview;

public class Solution {
	
	static int findMissing(int arr[], int size)
    {
        // First separate positive and
        // negative numbers
        int shift = Sagrigate(arr, size);
        int arr2[] = new int[size - shift];
        int j = 0;
        for (int i = shift; i < size; i++) {
            arr2[j] = arr[i];
            j++;
        }
        // Shift the array and call
        // findMissingPositive for
        // positive part
        return findMissingPositive(arr2, j);
    }
      private static int findMissingPositive(int[] arr2, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int Sagrigate(int[] arr, int size) {
		// TODO Auto-generated method stub
		return 0 ;
	}
    public static void main(String[] args)
    {
        int arr[] = { 0, 10, 2, -10, -20 };
        
        int arr_size = arr.length;
        int temp=1;
        
         for(int i=0;i<=arr.length; i++)
        	 
    	   if (arr[i]>1 && arr[i]>temp) {
    		   temp++ ;
    	   }
        	
        int missing = findMissing(arr, arr_size);
        System.out.println("The smallest positive>0 missing number is " + missing);
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



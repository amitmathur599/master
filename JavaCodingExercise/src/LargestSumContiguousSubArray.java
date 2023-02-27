import java.util.Arrays;

//Kadane's Algorithm
public class LargestSumContiguousSubArray {

	public static void main(String[] args) {
		int[] a = { 4, -2, -3, 4, -1, -2, 1, 5, -3 };
	
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
	
		int s = 0, start = 0, end = 0;
		
		for (int i = 0; i < a.length; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}

		}
		System.out.println("Start Position :" + start);
		System.out.println("End Position : "+end);
		//System.out.println(Arrays.toString(Arrays.copyOfRange(a, start, end+1)));
		printArrayInIndexRange(a, start, end+1);
		System.out.println("Maximum Sum Sub Array :"+max_so_far);
	}
	
	public static void printArrayInIndexRange(int[] array, int startIndex, int endIndex) {
	      for(int i = startIndex; i < endIndex && i < array.length; i++) {
	          System.out.println(array[i]);
	      }       
	}

}

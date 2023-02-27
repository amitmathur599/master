package Array;

//We increment it but use the modulo to get back to "0" when we reach the length of the array.
public class Fill2DArrayWith1DArray {

	public static void main(String[] args) {
		int m = 3;
		int n = 5;
		int[][] matrix = new int[m][n];
		int[] array = { 1, 2, 3, 4 };

		int currentIndex = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = array[currentIndex];
				currentIndex = (currentIndex + 1) % array.length;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		//System.out.println(5 % 6);
	}

}

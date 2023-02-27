import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class kthLargestandSmallestElement {

	public static void main(String[] args) {

		int k = 3;
		Integer[] a = { 2, 3, 1, 4, -2, 0, -3, 0, -1, 5 };

		List<Integer> list = Arrays.asList(a);
		System.out.println(list.stream().sorted()// Collections.reverseOrder()
				.distinct().limit(k).skip(k - 1).collect(Collectors.toList()));

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
			if (i == k - 1) {
				System.out.println(a[i]);
				break;
			}
		}
	}

}

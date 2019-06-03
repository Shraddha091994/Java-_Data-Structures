
public class SelectionStringSort {
	public static void main(String[] args) {
		String[] arr = { "Deepak", "Amit", "Rahul", "Vironika", "Deepash", "Rohit" };
		int min;
		String temp;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			{
				for (int j = i; j < arr.length; j++) {

					if (arr[j].compareTo(arr[min]) < 0) {
						min = j;
					}
				}

				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			for (i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}

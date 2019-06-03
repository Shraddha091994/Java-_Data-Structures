
public class LinearSrchString {
	public static void main(String[] args) {
		String[] arr = { "deepak", "rahul", "deepesh", "viraniks", "amit" };
		String item = "shraddha";
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(item)) {
				System.out.println("item present in " + i + "index position");
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println("item not present in the list");
		}
	}
}
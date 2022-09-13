import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int sum = 1;
		int start_index = 1;
		int end_index = 1;
		int count = 1;

		while (end_index != n) {
			if (sum == n) {
				end_index++;
				count++;
				sum += end_index;
			} else if (sum > n) {
				sum -= start_index;
				start_index++;
			} else {
				end_index++;
				sum += end_index;
			}
		}
		
		System.out.println(count);

		scanner.close();
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			int primeCount = 0;
			for (int j = 1; j <= num[i]; j++) {
				if (num[i] % j == 0)
					primeCount++;
			}
			if (primeCount == 2)
				count++;
		}
		System.out.println(count);
		
		scanner.close();
	}

}

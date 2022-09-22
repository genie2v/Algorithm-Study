import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String numbers = scanner.next();
		String[] number = numbers.split("");
		
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum += Integer.parseInt(number[i]);
		}
		
		System.out.println(sum);
		
		scanner.close();
	}

}

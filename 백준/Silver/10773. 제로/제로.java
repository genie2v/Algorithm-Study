import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<k;i++) {
			int num = scanner.nextInt();
			if(num==0) stack.pop();
			else stack.push(num);
		}
		
		int sum = 0;
		while(!stack.empty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
		scanner.close();

	}

}

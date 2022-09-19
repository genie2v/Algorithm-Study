import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bufferedReader.readLine());
		for(int i=0;i<T;i++) {
			String result = check(bufferedReader.readLine());
			System.out.println(result);
		}
	}
	
	public static String check(String testCase) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<testCase.length();i++) {
			switch(testCase.charAt(i)) {
			case '(' : 
				stack.push(testCase.charAt(i));
				break;
			case ')' :
				if(stack.empty()) return "NO";
				else if(stack.peek().equals('(')) {
					stack.pop();
					break;
				}
			}
		}
		
		if(!stack.empty()) return "NO";
		else return "YES";
	}

}

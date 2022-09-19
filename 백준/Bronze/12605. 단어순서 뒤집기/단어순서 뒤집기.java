import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		Stack<String> stack = new Stack<>();
		for(int i=0;i<N;i++) {
			String testCase = bufferedReader.readLine();
			String[] str = testCase.split(" ");
			for(int j=0;j<str.length;j++) {
				stack.push(str[j]);
			}
			String revert = "";
			while(!stack.empty()) {
				revert += stack.pop() + " ";
			}
			revert = revert.trim();
			System.out.println("Case #" + (i+1) + ": " + revert);
		}

	}


}

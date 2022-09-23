import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<N;i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			String order = stringTokenizer.nextToken();
			if(stringTokenizer.hasMoreTokens()) {
				int num = Integer.parseInt(stringTokenizer.nextToken());
				if(order.equals("push")) stack.push(num);
			} else {				
				switch (order) {
				case "pop":
					if(!stack.empty()) System.out.println(stack.pop()); 
					else System.out.println(-1);
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					if(stack.empty()) System.out.println(1);
					else System.out.println(0);
					break;
				case "top":
					if(!stack.empty()) System.out.println(stack.peek());
					else System.out.println(-1);
					break;
				default:
					break;
				}
			}
			
		}

	}

}

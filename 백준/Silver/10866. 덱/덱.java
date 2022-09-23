import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		Deque<Integer> deQue = new ArrayDeque<>();
		
		for(int i=0;i<N;i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			String order = stringTokenizer.nextToken();
			if(stringTokenizer.hasMoreTokens()) {
				int num = Integer.parseInt(stringTokenizer.nextToken());
				if(order.equals("push_front")) deQue.addFirst(num);
				else if(order.equals("push_back")) deQue.addLast(num);
			} else {
				switch (order) {
				case "pop_front":
					if(!deQue.isEmpty()) System.out.println(deQue.pollFirst());
					else System.out.println(-1);
					break;
				case "pop_back":
					if(!deQue.isEmpty()) System.out.println(deQue.pollLast());
					else System.out.println(-1);
					break;
				case "size":
					System.out.println(deQue.size());
					break;
				case "empty":
					if(deQue.isEmpty()) System.out.println(1);
					else System.out.println(0);
					break;
				case "front":
					if(!deQue.isEmpty()) System.out.println(deQue.peekFirst());
					else System.out.println(-1);
					break;
				case "back":
					if(!deQue.isEmpty()) System.out.println(deQue.peekLast());
					else System.out.println(-1);
					break;
				default:
					break;
				}
			}
		}

	}

}

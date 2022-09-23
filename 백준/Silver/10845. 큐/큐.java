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
		Deque<Integer> queue = new ArrayDeque<>();
		
		for(int i=0;i<N;i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			String word = stringTokenizer.nextToken();
			if(stringTokenizer.hasMoreTokens()) {
				int num = Integer.parseInt(stringTokenizer.nextToken());
				if(word.equals("push")) queue.add(num);
			} else {
				switch (word) {
				case "pop":
					if(!queue.isEmpty()) System.out.println(queue.poll());
					else System.out.println(-1);
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					if(queue.isEmpty()) System.out.println(1);
					else System.out.println(0);
					break;
				case "front":
					if(!queue.isEmpty()) System.out.println(queue.peekFirst());
					else System.out.println(-1);
					break;
				case "back":
					if(!queue.isEmpty()) System.out.println(queue.peekLast());
					else System.out.println(-1);
					break;
				default:
					break;
				}
			}
		}

	}

}

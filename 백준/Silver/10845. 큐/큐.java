import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(stringTokenizer.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		int[] rear = new int[1];
		
		for(int i=0;i<N;i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			String word = stringTokenizer.nextToken();
			if(stringTokenizer.hasMoreTokens()) {
				int num = Integer.parseInt(stringTokenizer.nextToken());
				rear[0] = num;
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
					if(!queue.isEmpty()) System.out.println(queue.peek());
					else System.out.println(-1);
					break;
				case "back":
					if(!queue.isEmpty()) System.out.println(rear[0]);
					else System.out.println(-1);
					break;
				default:
					break;
				}
			}
		}

	}

}

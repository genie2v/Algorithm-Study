import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i=0;i<N;i++) {
			hashSet.add(Integer.parseInt(stringTokenizer.nextToken()));
		}
		
		int M = Integer.parseInt(bufferedReader.readLine());
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for(int i=0;i<M;i++) {
			if(hashSet.contains(Integer.parseInt(stringTokenizer.nextToken()))) {
				System.out.println(1);
			} else System.out.println(0);
		}

	}

}

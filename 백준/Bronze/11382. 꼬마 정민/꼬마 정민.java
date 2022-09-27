import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		long sum = 0;
		while(stringTokenizer.hasMoreTokens()) {
			sum += Long.parseLong(stringTokenizer.nextToken());
		}
		System.out.println(sum);
	}

}

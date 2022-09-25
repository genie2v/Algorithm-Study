import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int m = Integer.parseInt(stringTokenizer.nextToken());
		
		int num1 = Math.max(n, m);
		int num2 = Math.min(n,m);
		int r = num1 % num2;
		if(r==0) {
			System.out.println(num2);
			System.out.println(n * m / num2);
		}
		
		while(r>0) {
			r = num1 % num2;
			if(r==0) {
				System.out.println(num2);
				System.out.println(n * m / num2);
				break;
			}
			num1 = num2;
			num2 = r;
		}

	}

}

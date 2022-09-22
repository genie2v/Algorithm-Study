import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		String num1 = stringTokenizer.nextToken();
		String n1 = "";
		String num2 = stringTokenizer.nextToken();
		String n2 = "";
		
		for(int i=2;i>=0;i--) {
			n1 += num1.charAt(i);
			n2 += num2.charAt(i);
		}
		
		System.out.println((int)Math.max(Integer.parseInt(n1), Integer.parseInt(n2)));
	}

}

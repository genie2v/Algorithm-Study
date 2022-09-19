import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		
		String case8 = bufferedReader.readLine();
		String[] case2 = {"000", "001", "010", "011", "100", "101", "110", "111"};
		
		if(case8.equals("0")) {
			System.out.println(case8);
			System.exit(0);
		}
		
		for(int i=0;i<case8.length();i++) {
			int j = case8.charAt(i) - '0';
			stringBuilder.append(case2[j]);
		}
		
		while(stringBuilder.charAt(0)=='0') {
			stringBuilder = new StringBuilder(stringBuilder.substring(1));
		}
		System.out.println(stringBuilder);
		
	}

}

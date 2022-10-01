import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));	
		char[] charArr = bufferedReader.readLine().toCharArray();
		
		for(char ch : charArr) {
			if(Character.isUpperCase(ch)) ch = Character.toLowerCase(ch);
			else ch = Character.toUpperCase(ch);
			System.out.print(ch);
		};
		
	}

}

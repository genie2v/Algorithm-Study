import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String str = bufferedReader.readLine().trim();
		if(str.equals("")) System.out.println(0);
		else {
			String[] words = str.split(" ");
			System.out.println(words.length);
		}
	}

}

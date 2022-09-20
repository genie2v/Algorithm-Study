import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int T = Integer.parseInt(stringTokenizer.nextToken());
		
		for(int i=0;i<T;i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int R = Integer.parseInt(stringTokenizer.nextToken());
			String S = stringTokenizer.nextToken();
			String[] word = S.split("");
			for(int j=0;j<word.length;j++) {
				for(int k=0;k<R;k++) {
					System.out.print(word[j]);
				}
			}
			System.out.println();
		}

	}

}

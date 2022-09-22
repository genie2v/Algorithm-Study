import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int asc = 0;
		int desc = 0;
		int i = 0;
		while(stringTokenizer.hasMoreTokens()) {
			int n = Integer.parseInt(stringTokenizer.nextToken());
			if(n==i+1) asc++;
			if(n==8-i) desc++;
			i++;
		}
		
		if(asc==8) System.out.println("ascending");
		else if(desc==8) System.out.println("descending");
		else System.out.println("mixed");
	}

}

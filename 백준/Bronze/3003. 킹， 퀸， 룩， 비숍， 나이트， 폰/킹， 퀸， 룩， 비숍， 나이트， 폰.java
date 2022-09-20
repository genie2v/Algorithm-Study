import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int[] pieces = {1, 1, 2, 2, 2, 8};
		int[] needPieces = new int[6];
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
		for(int i=0;i<6;i++) {
			needPieces[i] = pieces[i] - Integer.parseInt(stringTokenizer.nextToken());
			System.out.print(needPieces[i] + " ");
		}

	}

}

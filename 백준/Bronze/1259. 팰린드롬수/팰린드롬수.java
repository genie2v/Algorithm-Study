import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String num = bufferedReader.readLine();
			if(num.equals("0")) break;
			String[] n = num.split("");
			int count = 0;
			for(int i=0;i<n.length/2;i++) {
				 if(n[i].equals(n[n.length-1-i])) count++;
			}
			if(count==n.length/2) System.out.println("yes");
			else System.out.println("no");
		}

	}

}

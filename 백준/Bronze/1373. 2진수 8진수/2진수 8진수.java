import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String case2 = bufferedReader.readLine();

		while((case2.length()%3)!=0) {
			case2 = "0" + case2;
		}
		String[] num = case2.split("");
		int[] case8 = new int[case2.length()/3];
		int idx = 0;
		int sum = 0;
		
		int j = case8.length-1;
		for(int i=num.length-1;i>=0;i--) {
			sum += Integer.parseInt(num[i]) * Math.pow(2, idx);
			idx++;
			if(idx==3) {
				idx = 0;
				case8[j] = sum;
				j--;
				sum = 0;
			}
		}
		
		for(int i=0;i<case8.length;i++) {
			System.out.print(case8[i]);
		}
	}

}

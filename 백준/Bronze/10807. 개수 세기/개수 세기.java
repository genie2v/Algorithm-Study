import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		int[] nums = new int[N];
		
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for(int i=0;i<nums.length;i++) {
			nums[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		int v = Integer.parseInt(bufferedReader.readLine());
		int count = 0;
		for(int num : nums) {
			if(num == v) count++;
		}
		System.out.println(count);
	}

}

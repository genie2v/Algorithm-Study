import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		int result = 0;
		int[] a = new int[n];
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		Arrays.sort(a);
        
		for (int k = 0; k < n; k++) {
			int find = a[k];
			int i = 0;
			int j = n - 1;
			while (i < j) {
				if (a[i] + a[j] == find) {
					if (i != k && j != k) {
						result++;
						break;
					} else if (i == k) {
						i++;
					} else if (j == k) {
						j--;
					}
				} else if (a[i] + a[j] < find) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(result);
	}

}

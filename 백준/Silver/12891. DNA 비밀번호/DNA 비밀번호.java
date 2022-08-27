import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] checkArr = new int[4];
	static int[] myArr = new int[4];
	static int checkPw = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int s = Integer.parseInt(stringTokenizer.nextToken());
		int p = Integer.parseInt(stringTokenizer.nextToken());

		int result = 0;

		char[] a = new char[s];
		a = bufferedReader.readLine().toCharArray();

		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
			if (checkArr[i] == 0) {
				checkPw++;
			}
		}

		for (int i = 0; i < p; i++) {
			add(a[i]);
		}
        if(checkPw == 4)
            result++;

		// 슬라이딩윈도우처리
		for (int i = p; i < s; i++) {
			int j = i - p;
			add(a[i]);
			remove(a[j]);

			if (checkPw == 4)
				result++;

		}

		System.out.println(result);
	}

	private static void add(char c) {
		switch (c) {
		case 'A':
			myArr[0]++;
			if (checkArr[0] == myArr[0])
				checkPw++;
			break;
		case 'C':
			myArr[1]++;
			if (checkArr[1] == myArr[1])
				checkPw++;
			break;
		case 'G':
			myArr[2]++;
			if (checkArr[2] == myArr[2])
				checkPw++;
			break;
		case 'T':
			myArr[3]++;
			if (checkArr[3] == myArr[3])
				checkPw++;
			break;
		}
	}

	private static void remove(char c) {
		switch (c) {
		case 'A':
			if (checkArr[0] == myArr[0])
				checkPw--;
			myArr[0]--;
			break;
		case 'C':
			if (checkArr[1] == myArr[1])
				checkPw--;
			myArr[1]--;
			break;
		case 'G':
			if (checkArr[2] == myArr[2])
				checkPw--;
			myArr[2]--;
			break;
		case 'T':
			if (checkArr[3] == myArr[3])
				checkPw--;
			myArr[3]--;
			break;
		}
	}

}

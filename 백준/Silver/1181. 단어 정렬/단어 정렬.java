import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		
		HashSet<String> hashSet = new HashSet<>();
		for(int i=0;i<N;i++) {
			hashSet.add(bufferedReader.readLine());
		}
		
		ArrayList<String> arrList = new ArrayList<>(hashSet);
		Collections.sort(arrList, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2);
				}
				else return s1.length() - s2.length();
			}
		});
		
		for(String word : arrList) {
			System.out.println(word);
		}

	}

}

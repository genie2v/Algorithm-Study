import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String str = bufferedReader.readLine().toUpperCase();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char word = str.charAt(i);
			if(hashMap.containsKey(word)) {
				hashMap.put(word, hashMap.get(word)+1);
			} else {
				hashMap.put(word, 1);
			}
		}
		
		int max_value = Collections.max(hashMap.values());
		ArrayList<Character> arrList = new ArrayList<>();
		for(HashMap.Entry<Character, Integer> entry : hashMap.entrySet()) {
			if(entry.getValue()==max_value) {
				arrList.add(entry.getKey());
			}
		}
		
		if(arrList.size()>1) System.out.println("?");
		else System.out.println(arrList.get(0));

	}

}

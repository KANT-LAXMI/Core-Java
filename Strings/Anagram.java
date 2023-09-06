package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a="race";
		String b="care";
		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();
		Arrays.sort(charA);
		Arrays.sort(charB);
		
		// APPROACH 1 : USING ARRAYS EQUALS METHOD
		
//		if(Arrays.equals(charA, charB)) {
//			System.out.println("given strings are in ANAGRAM");
//		}else {
//			System.out.println("not ANAGRAM");
//		}
		
		
		// APPROACH 2: USING ASCII VALUE
		int sum1=0;int sum2=0;
		for(int i=0;i<charA.length;i++) {
			System.out.println((int)charA[i]);
			sum1+=(int)charA[i];
		}
		
		for(int i=0;i<charB.length;i++) {
			sum2+=(int)charB[i];
		}
			if(sum1==sum2) {
				System.out.println("given strings are in ANAGRAM");
			}else {
				System.out.println("not ANAGRAM");
			}
		
		
	}

}

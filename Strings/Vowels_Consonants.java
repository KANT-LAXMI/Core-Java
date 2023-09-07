package strings;

public class Vowels_Consonants {

	public static void main(String[] args) {
		int vCount=0,cCount=0;
		
		String str="Life is to Goods";
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.println("Vowels in given string are   "+str.charAt(i)+" at position  "+i);
				vCount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				System.out.println("Consonants in given string are   "+str.charAt(i)+" at position  "+i);
				cCount++;
			}
		}
		System.out.println("Vowels count are" + vCount);
		System.out.println("Consonants count are" +cCount);
	}

}

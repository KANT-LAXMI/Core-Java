package strings;

public class NumberOfPunctuationCharacter {

	public static void main(String[] args) {
		
		int count=0;
		String str="qw!e,sd.fht?.";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)=='?'||str.charAt(i)=='.') {
				System.out.println("Punctuation is  "+str.charAt(i)+" at position "+i);
				count++;
			}	
		}
		System.out.println("Total number of Punctuation are" +count);
	}

}

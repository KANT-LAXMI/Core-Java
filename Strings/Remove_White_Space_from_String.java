package strings;

public class Remove_White_Space_from_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="   abcd  efgh  ijkl   "; 
		String replacedString = str.replaceAll("\\s", "");
		System.out.println(replacedString);
	}

}

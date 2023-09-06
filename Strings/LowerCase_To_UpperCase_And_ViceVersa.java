package strings;

public class LowerCase_To_UpperCase_And_ViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "HelloWorld";
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				ch[i] = (char) ((int) ch[i] - 32);
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				ch[i] = (char) ((int) ch[i] + 32);
			}
		}
		System.out.println(new String(ch));
//		for(int i=0;i<str.length();i++) {
//			System.out.print(ch[i]);
//		}

	}

}

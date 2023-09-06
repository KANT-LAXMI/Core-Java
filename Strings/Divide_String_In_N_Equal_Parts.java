package strings;

import java.util.Scanner;

public class Divide_String_In_N_Equal_Parts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string to be divided");
		String str = sc.next();
		System.out.println("enter divided size");
		int n = sc.nextInt();

		int sub_size = str.length() / n;

		for (int i = 0; i < str.length(); i++) {
			if (str.length() % n != 0) {
				System.out.println("can't be divided");
				return;
			} else if (i % sub_size == 0) {
				System.out.println();
			}
			System.out.print(str.charAt(i));
		}
		sc.close();

	}

}

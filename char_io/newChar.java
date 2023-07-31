package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class newChar {

	public static void main(String[] args) {
		System.out.println("Enter src file name n dest file name on separate lines");
		try(Scanner sc=new Scanner(System.in);
			//Java App <--- BR <---- FR <--- src file
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				//Java App ---> PW --> FW --> dest test file
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine(),true))
				)
		{
		br.lines().filter(s->s.length()>50).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
			
			
		} //pw.close --> pw.flush , pw.close , dest file close , br.close , sc.close
		
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
		

	}

} 

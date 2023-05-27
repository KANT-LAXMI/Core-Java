package testerForEmployee;
import static utils.IOutils.restoreAllEmployee;
import static utils.IOutils.storeAllEmployee;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Employee;

public class TTTTTTTTTTTTTTTTTTTTTT {
//tsabi with sc
	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("enter the filename");
		String fileName = sc.next();
		Map<String,Employee>emps=restoreAllEmployee(fileName);
		System.out.println("Employee stored "+emps);
		boolean exit=false;
		while(!exit) {
			try {
				System.out.println("enter the MENU");
				System.out.println("enter your choice");
				switch (sc.nextInt()) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 0:
					exit=true;
					storeAllEmployee(emps, fileName);
					break;

				
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				sc.nextLine();
			}
		}
	}

	}

}

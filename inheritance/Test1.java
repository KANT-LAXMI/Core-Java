package p2;
import static p2.Printer.SPEED;//package name mainclass name 

public class Test1 {

	public static void main(String[] args) {
		//direct ref.
		ConsolePrinter printer=new ConsolePrinter();
		printer.print("mesg1");
		//can non implement class access i/f constant? yes
		System.out.println(SPEED);
		
	}

}

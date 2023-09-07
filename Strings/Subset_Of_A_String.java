package strings;

public class Subset_Of_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="HELLO";
		int n=str.length();
		int temp=0;
		
		String arr[]=new String[n*(n+1)/2];
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				arr[temp]=str.substring(i, j+1);
				temp++;
			}
		}
		System.out.println("Possible Subset are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println( );
		System.out.println("total subset are " +temp);
		
	}

}

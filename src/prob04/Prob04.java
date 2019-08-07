package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char c1[] = new char[str.length()];
		/* 코드를 완성합니다 */
		for (int i = 0; i < str.length(); i++) {
			c1[i]=str.charAt(str.length()-1-i);
//			for (int j=str.length()-1;  j>=0 ; j--) {
//				
//			}
		}
			
		System.out.println();
		return c1;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}
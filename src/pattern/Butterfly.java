package pattern;

public class Butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=9;
		int start=1; int end=9;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(j<=start || j>=end) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<5) {
				end--;
				start++;
			}
			else {
				end++;
				start--;
			}
			System.out.println();
		}
	}

}

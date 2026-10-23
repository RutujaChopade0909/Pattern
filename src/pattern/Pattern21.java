package pattern;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=10;
		int start=4;
		int end=5;
for(int i=0;i<a;i++) {
	for(int j=0;j<b;j++) {
		if(j<=start || j>=end) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
	if(i<4) {
		start--;
		end++;
		
	}
	else {
		start++;
		end--;
	}
}
	}

}

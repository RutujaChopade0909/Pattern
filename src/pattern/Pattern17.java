package pattern;

//public class Pattern17 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int a=9;
//		int start=0;
//		char c='A';
//		for(int i=0;i<a;i=i+2) {
//			char d=c;
//			for(int j=0;j<=i;j++) {
//				if(j<start) {
//				System.out.print(d++);
//			}
//			else{
//				System.out.print(d--);
//			}
//			}
//			start++;
//			System.out.println();
//		}
//	}
//
//}

public class Pattern17 {

	public static void main(String[] args) {

int irange=9;
int jrange=9;
int start=1;
for(int i=1;i<=irange;i++) {
	for(int j=1;j<=jrange;j++) {
		if(j>=start && j<=jrange) {
			System.out.print("*");
		}
		else
			System.out.print(" ");
	}
	if(i<5) {
		start++;
		jrange--;
	}
	else {
		start--;
		jrange++;
	}
	System.out.println();
}
}}

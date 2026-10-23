package Pattern2;

public class Pattern3 {
	public static void main(String[] args) {

	int irange=9;
	int jrange=5;
	int start=1;
	int a=1;
	for(int i=0;i<irange;i++) {
		int b=a;
		for(int j=0;j<jrange;j++) {
			if(j<start)
			{
				System.out.print(b);
				}
			
		}
		System.out.println();
		if(i<4) {
			a++;
			start++;
		}
		else {
			start--;
			a--;
		}
	}
}
}


//1
//22
//333
//4444
//55555
//4444
//333
//22
//1
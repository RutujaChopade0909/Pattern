package pattern;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int c=5;
for(int i=0;i<a;i++) {
	int d=c;
	for(int j=0;j<a;j++) {
		if(j>=i) {
		System.out.print(d);
	}
	else {
		System.out.print("1");
	}
	}
	c--;
	System.out.println();
}
	}


}


//55555
//14444
//11333
//11122
//11111

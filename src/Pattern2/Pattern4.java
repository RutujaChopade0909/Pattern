package Pattern2;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=5;
		int start=1;
		char a='A';
		for(int i=0;i<irange;i++) {
			char b=a;
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

//A
//BB
//CCC
//DDDD
//EEEEE
//DDDD
//CCC
//BB
//A
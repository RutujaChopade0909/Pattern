package pattern;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=1;
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(i==j) {
					System.out.print(b++);
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
//10000
//02000
//00300
//00040
//00005
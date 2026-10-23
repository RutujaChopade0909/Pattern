package pattern;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int irange=5;
int jrange=9;
int start=5;
int end=5;
int ele=1;
int mid=(start+end)/2;
for(int i=1;i<=irange;i++) {
	int ele2=ele;
	for(int j=1;j<=jrange;j++) {
		if(j>=start && j<=end) {
			if(j<mid) {
				System.out.print(ele2++);
			}
			else {
				System.out.print(ele2--);
			}
		}else {
			System.out.print(" ");
		}
	}
		start--;
		end++;
		System.out.println();
	
}
	}

}
//    1    
//   121   
//  12321  
// 1234321 
//123454321
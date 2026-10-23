package pattern;

//public class Pattern20 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a=10;
//	int start=5;int end=5;
//		for(int i=0;i<a;i=i+2) {
//			int num=1;
//			for(int j=0;j<a;j++) {
//				if(j>=start && j<=end) {
//					if (j <= 5) {
//						System.out.print(num);
//						num++;
//					} else {
//						num--;
//						System.out.print(num);
//					}
//
//				} else {
//					System.out.print(" ");
//				}
//			}
//
//			
//			System.out.println();
//			start--;
//			end++;
//		
//
//		}
//	}
//
//}
//
//     *           1
//    ***         121
//   *****       12321
//  *******     1234321
// *********   123454321



public class Pattern20 {

	public static void main(String[] args) {

		int a = 10;
		int start = 5;
		int end = 5;

		for (int i = 0; i < a; i = i + 2) {

			int num = 1;

			for (int j = 0; j < a; j++) {

				if (j >= start && j <= end) {

					System.out.print(num);

					if (j < 5) {
						num++;
					}

				} else {
					System.out.print(" ");
				}
			}

			System.out.println();

			start--;
			end++;
		}
	}
}
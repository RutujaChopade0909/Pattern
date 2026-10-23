package pattern;

//public class Pattern23 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a=9;
//		int start=0;
//		for(int i=0;i<a;i++) {
//			for(int j=0;j<5;j++) {
//				if(j>=start) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//			if(i<4) {
//				start++;
//			}
//		}
//
//	}
//
//}

//*****
// ****
//  ***
//   **
//    *
//    **
//    ***
//    ****
//    *****


public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int start = 0;

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < 9; j++) {

				if (i < 5) {

					if (j >= start && j < 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				} else {

					if (j >= 4 && j <= i - 1 + 4) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}

			System.out.println();

			if (i < 4) {
				start++;
			}
		}
	}
}
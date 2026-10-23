package pattern;

public class pPattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iRange = 5;
        int jRange = 7;
        for (int i = 0; i < iRange; i++) {
            for (int j = 0; j < jRange; j++) {
                if (i+j==7 || i-j==1||(i==1&&j==3)||((i==0)&& (j==1||j==2||j==4||j==5))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

	}

}

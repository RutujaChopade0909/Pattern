package Pattern2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int irange=9;
int jrange=5;
int start=0;
for(int i=0;i<irange;i++) {
	for(int j=0;j<jrange;j++) {
		if(j<=start)
		{
			System.out.print("*");
			}
		
	}
	System.out.println();
	if(i<4) {
		start++;
	}
	else {
		start--;
	}
}
	}

}

//
//*
//**
//***
//****
//*****
//****
//***
//**
//*
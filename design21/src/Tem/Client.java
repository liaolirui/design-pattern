package Tem;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADefiniteIntegral[] x=new ADefiniteIntegral[2];
		x[0]=new DefIntegralXX(0,20,100);
		x[1]=new DefIntegralLn(2.71,20,100);
		for(int i=0;i<2;i++) {
			System.out.println(x[i].CalDefiniteIntegral());
		}
	}

}

import java.util.Scanner;


public class PinturaMuro{
	
	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
		double x = 12, y=3, v, res;
		v = ler.nextDouble();
		
		res = (v*x*y) + 100;
		
		System.out.printf("%.1f", res);
		
		
		
	}
}
import java.util.Scanner;


public class RaizQuadrada{
	
	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
		double X, raiz;
		X = ler.nextDouble();
		
		raiz = Math.sqrt(X);
		
		System.out.printf("%.5f", raiz);
		
		
		
	}
}
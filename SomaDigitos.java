
import java.util.Scanner;

public class SomaDigitos{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int N, soma, digito;
		N = ler.nextInt();
		
		soma = 0; 
		while (N > 0){
			digito =  N % 10; 
			soma = soma + digito;
			N = N / 10;
		}
		
		System.out.printf("%d", soma);
	}
}
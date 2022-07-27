import java.util.Scanner;

public class SomaColecao{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int [] vet = new int[100];
		int a=0, i=0;
		int soma =0;
		
		while(a==0){
			vet[i] = ler.nextInt();
			if(vet[i] == -1){
				a = 1;
				break;
			}
			soma = soma + vet[i];
			i++;
			
		}
		
			System.out.printf("%d", soma);
		
		
	}
}
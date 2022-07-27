import java.util.Scanner;
public class AnimaisCedulas{
	
	public static void main(String[] args){
		int a, aux=0;
		Scanner ler = new Scanner(System.in);
		a = ler.nextInt();
		if(a == 2){
			System.out.println("Tartaruga");aux=1;
		}
		if(a == 5){
			System.out.println("Garça");aux=1;
		}
		if(a == 10){
			System.out.println("Arara");aux=1;
		}
		if(a == 20){
			System.out.println("Mico-leão-dourado");aux=1;
		}
		if(a == 50){
			System.out.println("Onça-pintada");aux=1;
		}
		if(a == 100){
			System.out.println("Garoupa");aux=1;
		}
		
		if(aux==0){
			System.out.println("erro");
		}
		
	}
}
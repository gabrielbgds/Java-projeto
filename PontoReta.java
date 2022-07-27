import java.util.Scanner;
public class PontoReta{
	
	public static void main(String[] args){
		float x, y, z=0;
		Scanner ler = new Scanner(System.in);
		x = ler.nextFloat();
		y = ler.nextFloat();
		z = (2*x) + y;
		if(z == 3){
			System.out.println("Ponto ("+x+", " +y+") pertence a reta 2x + y = 3.");
		}
		if(z != 3){
			System.out.println("Ponto ("+x+", " +y+") nao pertence a reta 2x + y = 3.");
		}
		
	}
}
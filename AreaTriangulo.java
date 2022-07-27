
import java.util.Scanner;

public class AreaTriangulo{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		Double a, b, c, s, Area;
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		
		if(a+b<=c){
			System.out.printf("Triangulo invalido");
		}else if(a+c<=b){
			System.out.printf("Triangulo invalido");
		}else if(b+c<=a){
			System.out.printf("Triangulo invalido");
		}else{
			s = (a+b+c)/2;
			Area = s*(s-a)*(s-b)*(s-c);
			Area = Math.sqrt(Area);
			System.out.printf("%.2f", Area);
		}
		
	}
}
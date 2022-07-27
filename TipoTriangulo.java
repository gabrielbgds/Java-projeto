import java.util.Scanner;

public class TipoTriangulo{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int a, b, c, temp;

    a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();

    if (a < b){
		 temp = a;
		 a = b;
		 b = temp;
    }

    if (b < c)

    {
        temp = b;
        b = c;
        c = temp;
    }

    if (a < b)
    {
        temp = a;
        a = b;
        b = temp;
    }

    if (a >= b + c)

    {
       System.out.println("invalido");
    } 
    else if (a == b && b == c)

    {
        System.out.println("equilatero");
    }

    else if (a == b || b == c)

    {
        System.out.println("isosceles");
    }else{
		 System.out.println("escaleno");
	 }

   
		
		
		
	}
}
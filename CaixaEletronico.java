import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CaixaEletronico{
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        double  n50 = 0,  n10 = 0,  n2 = 0;
        double  N;
        N = input.nextDouble();
		 
		 if((N < 0) ||(N % 2 != 0)){
			 System.out.println("Valor Invalido");
		 }else{
			 
			  n50 = N / 50.0;
        N %= 50;
        
        n10 = N / 10.0;
        N %= 10;
        
        n2 = N / 2.0;
        N %= 2;
 
        
        System.out.printf((int)n50 + " notas de R$50, ");
       
        System.out.printf((int)n10 + " notas de R$10 e ");
        
        System.out.printf((int)n2 + " notas de R$2");
		 }

       
        

    }
}
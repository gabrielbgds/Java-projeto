import java.util.Scanner;
import java.text.DecimalFormat; 

public class AngryBirds{
	
	public static void main(String[] args){
		Double Vo=0.00, a=0.00, d=0.00, R = 0.00;
		Scanner ler = new Scanner(System.in);
		Vo = ler.nextDouble();
		a = ler.nextDouble();
		d = ler.nextDouble();
		
		a = Math.toRadians(a);
		a = 2.00*a;
		
		a = Math.sin(a);
		R = (Vo*Vo) * a;
		R = (double)R/ 9.80;
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		String s1, s2, s3, test;
		s1 = Double.toString(d);
		s2 = Double.toString(d-0.01);
		s3 = Double.toString(d+0.01);
		test = df.format(R);
		
		if(s1.equals(test)){
			System.out.println("1");
		}
		else if(s2.equals(test)){
			System.out.println("1");
		}
		else if(s3.equals(test)){
			System.out.println("1");
		}else{
			System.out.println("0");
			
		}
		
		
		
		
		
	}
}
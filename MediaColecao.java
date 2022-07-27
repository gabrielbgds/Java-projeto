import java.util.Scanner;

class MediaColecao {

    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
		 Double a, media=0.0, soma=0.0;
		 int i=0;
		 int aux=0;
		 while(i==0){
			 a = scan.nextDouble();
			 if(a==-1){
				 i = 1;
				 break;
			 }
			 soma = soma + a;
			 aux++;
			 media = soma/aux;
			 
		 }
		 System.out.printf("%.2f", media);
     
    }
}
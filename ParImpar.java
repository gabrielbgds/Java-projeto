import java.util.Scanner;
public class ParImpar{
	
	public static void main(String[] args){
		int num=0, i;
		Scanner ler = new Scanner(System.in);
		//a = ler.nextInt();
		while(num != -1){
			num = ler.nextInt();
			if(num == -1){
				break;
			}
			if(num % 2 == 0){
				System.out.println("PAR");
			}else{
				System.out.println("IMPAR");
			}
		}
	}
}
import java.util.Scanner;

class AreaVolume {

    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);

       double raio = scan.nextFloat();
       double area = Math.PI * raio * raio;
		 double volume = 4.0/3.0* Math.PI * raio*raio*raio;

       System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n" ,raio, area);
		 System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos." ,raio, volume);
    }
}
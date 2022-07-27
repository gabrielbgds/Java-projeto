import java.util.ArrayList;
import java.util.Collections;
 
public class ListaDuplamenteEncadeada{
  public static void main(String[] args){
    // cria uma ArrayList que conterá strings
    ArrayList<String> nomes = new ArrayList<String>();
     
    // adiciona itens na lista
    nomes.add("6");
    nomes.add("5");
    nomes.add("5");
    nomes.add("3");
	 nomes.add("5");
     
    // exibe os elementos da ArrayList
    for(int i = 0; i < nomes.size(); i++)
      System.out.println(nomes.get(i));    
  
    // Vamos inverter a ordem dos elementos
    Collections.reverse(nomes); 
 
    // exibe os elementos da ArrayList
    System.out.println();
    for(int i = 0; i < nomes.size(); i++)
      System.out.println(nomes.get(i));
 
    System.exit(0);
  }
}
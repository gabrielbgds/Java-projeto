import java.io.IOException;
///import java.util.Scanner;

public class StringNo {
	 public static void main(String[] args) {
		class No {
			private Object dado;
			private No prox;
			public No(Object dado) {
				this.dado = dado;
				this.prox = null;
			}
			public Object getDado() {
				return dado;
			}
			public No getProx() {
				return prox;
			}
			public void setProx(No prox) {
				this.prox = prox;
			}
		}
		 
		 public class ListaEncadeada {
			 private No topo;
			 private int tamanho;
			 
			 public ListaEncadeada() {
				 topo = null;
				 tamanho = 0;
			 }
			 
			 public int tamanho() {
				 return tamanho;
			 }
			 
			 public void imprime() {
				 for (No noAtual=topo; noAtual!=null; noAtual=noAtual.getProx())
					 System.out.println(noAtual.getDado());
			 }
			 
			 public Object get(int indice) {
				 if (indice < 0 || indice >= tamanho) return null;
				 
				 No noAtual = topo;
				 
				 while (indice-- > 0) noAtual = noAtual.getProx();
				 return noAtual.getDado();
			 }
			 
			 public No busca(Object dado) {
				 No noAtual = topo;
				 while (noAtual!=null && !noAtual.getDado().equals(dado))
					 noAtual = noAtual.getProx();
				 return noAtual;
			 }

			 
  // Métodos ...
}
		 public void insereInicio(Object dado) {
			 No novoNo = new No(dado);
			 novoNo.setProx(topo);
			 topo = novoNo;
			 tamanho++;
		 }
		 
		 public void insereFim(Object dado) {
			 No novoNo = new No(dado);
			 tamanho++;
			 
			 if (topo == null) {
				 topo = novoNo;
			 } else {
				 No noAtual = topo;
				 while (noAtual.getProx() != null) noAtual = noAtual.getProx();
				 noAtual.setProx(novoNo);
			 }
		 }
		 public boolean insereApos(Object anterior, Object dado) {
			 No noAtual = topo;
			 while (noAtual!=null && !noAtual.getDado().equals(anterior))
				 noAtual = noAtual.getProx();
			 if (noAtual == null) return false;
			 No novoNo = new No(dado);
			 novoNo.setProx(noAtual.getProx());
			 noAtual.setProx(novoNo);
			 tamanho++;
			 return true;
		 }
		 
		 
		 
	 }
}// fim da classe Lista
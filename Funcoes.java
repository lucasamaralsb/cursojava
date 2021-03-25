package modulo1;

public class Funcoes {

	public static void main(String[] args) {
	int resultado = soma(10, 5);
	System.out.println(resultado);
	quadrado(9);
	
	String texto = mensagem();
	System.out.println(texto);
	olamundo(); 
	
	int n =8;
	
	String res = n > 10?"ok":"ferrou";
	System.out.println(res);
	

	}
	//Função com retorno inteiro e recebe 2 paramentros 
	static int soma(int a, int b) {
		return a+b;
	}
	static void quadrado(int numero) {
		System.out.println(numero*numero);
	}
	static String mensagem() {
		return "Mensagem do Sistema";
		
	}
	static void olamundo() {
		System.out.println("olá mundo");
	}

}

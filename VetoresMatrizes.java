package modulo1;
import java.util.ArrayList;
public class VetoresMatrizes {

	public static void main(String[] args) {
		//Declaração de um vetor vazio
		
		int numeros[] = new int [5];
		numeros[0]=10;
		numeros[1]=20;
		numeros[2]=30;
		numeros[3]=40;
		numeros[4]=50;
		
		System.out.println(numeros[2]);
		
		//Declarando vetor com seus valores
		
		char consoantes[] = {'b','c'};
		System.out.println(consoantes[1]);
		
		//Criando ArrayList
		ArrayList<Integer>pares = new ArrayList<>();
		
		pares.add(2);
		pares.add(6);
		pares.add(10);
		pares.add(1, 4);//indica o indice e o valor
		pares.sort(null);//organiza aleatoriaente
		pares.remove(2); //remove o index indicado
		
		System.out.println(pares.get(1));

	}

}

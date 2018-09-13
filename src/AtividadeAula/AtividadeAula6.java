package AtividadeAula;

import animais.Cachorro;
import animais.Gato;


public class AtividadeAula6 {

	public static void main(String[] args) {

		/* Chamada de métodos para o objeto Cachorro */
		Cachorro umCachorro = new Cachorro();
		umCachorro.setNome("Buddy");
		umCachorro.setRaca("Labrador");
		
		System.out.println("O nome do cachorro é: " + umCachorro.getNome());
		System.out.println("A raça do " + umCachorro.getNome() + " é: " + umCachorro.getRaca());
		System.out.println("");

		/* Chamada de métodos para o objeto gato */
		Gato umGato = new Gato();
		umGato.setIdade(32);
		umGato.setNumPatas(4);
		umGato.setSexo("M");
		umGato.setEhPeixe(false);
		
		System.out.println("O gato é ou não é um peixe? " + umGato.isEhPeixe());
		System.out.println("A idade do gato é: " + umGato.getIdade());
		System.out.println("O número de patas do gato é de: " + umGato.getNumPatas());
		System.out.println("O sexo do gato é: " + umGato.getSexo());
		System.out.println("O gato é ou não é um peixe? " + umGato.isEhPeixe());

	}
}
package AtividadeAula;

import animais.Cachorro;
import animais.Gato;


public class AtividadeAula6 {

	public static void main(String[] args) {

		/* Chamada de m�todos para o objeto Cachorro */
		Cachorro umCachorro = new Cachorro();
		umCachorro.setNome("Buddy");
		umCachorro.setRaca("Labrador");
		
		System.out.println("O nome do cachorro �: " + umCachorro.getNome());
		System.out.println("A ra�a do " + umCachorro.getNome() + " �: " + umCachorro.getRaca());
		System.out.println("");

		/* Chamada de m�todos para o objeto gato */
		Gato umGato = new Gato();
		umGato.setIdade(32);
		umGato.setNumPatas(4);
		umGato.setSexo("M");
		umGato.setEhPeixe(false);
		
		System.out.println("O gato � ou n�o � um peixe? " + umGato.isEhPeixe());
		System.out.println("A idade do gato �: " + umGato.getIdade());
		System.out.println("O n�mero de patas do gato � de: " + umGato.getNumPatas());
		System.out.println("O sexo do gato �: " + umGato.getSexo());
		System.out.println("O gato � ou n�o � um peixe? " + umGato.isEhPeixe());

	}
}
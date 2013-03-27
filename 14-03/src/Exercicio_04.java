import sun.org.mozilla.javascript.internal.regexp.SubString;


public class Exercicio_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercicio_04 ex = new Exercicio_04();
		
		ex.ex08();

	}
	// 5) Ler a matrícula de um funcionário que estará no seguinte formato sssnnnnaaaa. 
	// Extrair e mostrar o setor, o número e o ano de admissão do funcionário. Exemplo:

	// Informe a matrícula do funcionário (sssnnnnnaaaa): ADM000232006

	// Setor do Funcionário = ADM
	// Número do Funcionário= 00023
	// Ano de admissão      = 2007
	void ex05() {
		String matricula, setor, numero, ano;
		System.out.print("Digite a matrícula do funcionário: ");
		matricula = Teclado.leString();
		
		setor = matricula.substring(0, 3);
		numero = matricula.substring(3, 8);
		ano = matricula.substring(8);
		
		System.out.println("Setor do funcionário = "+setor);
		System.out.println("Número do funcionário = "+numero);
		System.out.println("Ano de admissão = "+ano);
		
	}
	
	// Ler o CPF no seguinte formato (nnn.nnn.nnn-nn). 
	// Mostrar o CPF sem os separadores. Exemplo:
	// Informe o CPF: 100.200.300-99
	// CPF sem formatação = 10020030099
	void ex06() {
		String cpf;
		System.out.println("Digite o CPF: ");
		cpf = Teclado.leString();
		cpf = cpf.replace(".", "").replace("-", "");
		
		System.out.println("CPF sem formatação = "+cpf);
	}
	
	// 7) O usuário informa a placa de um carro no formato aaa-nnnn. 
	// O programa separa e mostra o prefixo, o número e o final da placa. Exemplo:
	// Digite a placa do carro: ACF-9876
	// Prefixo= ACF
	// Número = 9876
	// Final  = 6
	void ex07() {
		String placa, prefixo, numero, digFinal;
		
		System.out.println("Insira a placa do carro: ");
		placa = Teclado.leString();
		
		prefixo = placa.substring(0, 3);
		numero = placa.substring(4, 8);
		digFinal = placa.substring(7);
		
		System.out.println("Prefixo = "+prefixo);
		System.out.println("Número = "+numero);
		System.out.println("Final = "+digFinal);
	}
	
	//	13) O usuário informa uma frase e uma palavra que esteja dentro dessa frase. 
	//	O programa informará os seguintes resultados:
	//	 - tamanho da frase informada.
	//	 - tamanho da palavra informada.
	//	 - posição dentro da frase onde começa a palavra informada.
	//	 - uma sub-frase, começando na palavra informada até o final da frase.
	//	 - tamanho da sub-frase
	//
	//	Exemplo:
	//
	//	Digite uma frase: ‘O Brasil é um país bonito.’
	//	Digite uma palavra que esteja nessa frase: ‘país’
	//
	//	Resultados:
	//	Tamanho da Frase     = 26
	//	Tamanho da Palavra   =  4
	//	Posição da Palavra   = 15
	//	Sub-Frase            = ‘país bonito.’
	//	Tamanho da Sub-frase = 12
	void ex08 () {
		String frase, palavra, subFrase;
		int tamanhoFrase, tamanhoPalavra, posicaoPalavra, tamanhoSubFrase;
		
		System.out.println("Informe uma frase:");
		frase = Teclado.leString();
		
		System.out.println("Informe uma palavra:");
		palavra = Teclado.leString();
		
		tamanhoFrase = frase.length();
		tamanhoPalavra = palavra.length();
		posicaoPalavra = frase.indexOf(palavra);
		subFrase = frase.substring(posicaoPalavra);
		tamanhoSubFrase = subFrase.length();
		
		System.out.println("Tamanho frase: "+tamanhoFrase);
		System.out.println("Tamanho palavra: "+tamanhoPalavra);
		System.out.println("Posição palavra: "+posicaoPalavra);
		System.out.println("Subfrase: "+subFrase);
		System.out.println("Tamanho subfrase: "+tamanhoSubFrase);
	}

}

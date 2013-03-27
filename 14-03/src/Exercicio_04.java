import sun.org.mozilla.javascript.internal.regexp.SubString;


public class Exercicio_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercicio_04 ex = new Exercicio_04();
		
		ex.ex08();

	}
	// 5) Ler a matr�cula de um funcion�rio que estar� no seguinte formato sssnnnnaaaa. 
	// Extrair e mostrar o setor, o n�mero e o ano de admiss�o do funcion�rio. Exemplo:

	// Informe a matr�cula do funcion�rio (sssnnnnnaaaa): ADM000232006

	// Setor do Funcion�rio = ADM
	// N�mero do Funcion�rio= 00023
	// Ano de admiss�o      = 2007
	void ex05() {
		String matricula, setor, numero, ano;
		System.out.print("Digite a matr�cula do funcion�rio: ");
		matricula = Teclado.leString();
		
		setor = matricula.substring(0, 3);
		numero = matricula.substring(3, 8);
		ano = matricula.substring(8);
		
		System.out.println("Setor do funcion�rio = "+setor);
		System.out.println("N�mero do funcion�rio = "+numero);
		System.out.println("Ano de admiss�o = "+ano);
		
	}
	
	// Ler o CPF no seguinte formato (nnn.nnn.nnn-nn). 
	// Mostrar o CPF sem os separadores. Exemplo:
	// Informe o CPF: 100.200.300-99
	// CPF sem formata��o = 10020030099
	void ex06() {
		String cpf;
		System.out.println("Digite o CPF: ");
		cpf = Teclado.leString();
		cpf = cpf.replace(".", "").replace("-", "");
		
		System.out.println("CPF sem formata��o = "+cpf);
	}
	
	// 7) O usu�rio informa a placa de um carro no formato aaa-nnnn. 
	// O programa separa e mostra o prefixo, o n�mero e o final da placa. Exemplo:
	// Digite a placa do carro: ACF-9876
	// Prefixo= ACF
	// N�mero = 9876
	// Final  = 6
	void ex07() {
		String placa, prefixo, numero, digFinal;
		
		System.out.println("Insira a placa do carro: ");
		placa = Teclado.leString();
		
		prefixo = placa.substring(0, 3);
		numero = placa.substring(4, 8);
		digFinal = placa.substring(7);
		
		System.out.println("Prefixo = "+prefixo);
		System.out.println("N�mero = "+numero);
		System.out.println("Final = "+digFinal);
	}
	
	//	13) O usu�rio informa uma frase e uma palavra que esteja dentro dessa frase. 
	//	O programa informar� os seguintes resultados:
	//	 - tamanho da frase informada.
	//	 - tamanho da palavra informada.
	//	 - posi��o dentro da frase onde come�a a palavra informada.
	//	 - uma sub-frase, come�ando na palavra informada at� o final da frase.
	//	 - tamanho da sub-frase
	//
	//	Exemplo:
	//
	//	Digite uma frase: �O Brasil � um pa�s bonito.�
	//	Digite uma palavra que esteja nessa frase: �pa�s�
	//
	//	Resultados:
	//	Tamanho da Frase     = 26
	//	Tamanho da Palavra   =  4
	//	Posi��o da Palavra   = 15
	//	Sub-Frase            = �pa�s bonito.�
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
		System.out.println("Posi��o palavra: "+posicaoPalavra);
		System.out.println("Subfrase: "+subFrase);
		System.out.println("Tamanho subfrase: "+tamanhoSubFrase);
	}

}

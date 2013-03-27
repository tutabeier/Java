
public class Exercicios_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercicios_02 exercicio = new Exercicios_02();
		exercicio.ex04();
	}
	
	// 1) Fa�a um programa que leia a quantidade de quil�metros que um carro percorreu e quantos quil�metros por litro de combust�vel esse carro faz.
	// O Programa calcula e imprime a quantidade de combust�vel gasta.
	void ex01() {
		float qntdQuilometros;
		float kmPorLitro;
		
		System.out.print("Insira a quantidade de km percorridos ");
		qntdQuilometros = Teclado.leFloat();
		
		System.out.print("Insira a quilometragem por litro do carro ");
		kmPorLitro = Teclado.leFloat();
		
		System.out.println("Quantidade de combust�vel gasto "+(qntdQuilometros/kmPorLitro)+"l.");
	}
	
	// 2) Fa�a um programa que leia a quantidade de quil�metros que um carro percorreu e quantos litros de gasolina foram gastos.
	// O programa calcula e imprime a quantidade de quil�metros por litro que esse carro faz.
	void ex02() {
		float qntdQuilometros;
		float qntdLitros;
		
		System.out.print("Insira a quantidade de km percorridos ");
		qntdQuilometros = Teclado.leFloat();
		
		System.out.print("Insira a quantidade de litros de gasolina gastos ");
		qntdLitros = Teclado.leFloat();
		
		System.out.println("O carro faz "+(qntdQuilometros/qntdLitros)+"km/l.");
	}

	// Leia a velocidade de um carro e a dist�ncia a ser percorrida. Calcule e imprima o tempo gasto.
	void ex03(){
		float velocidade;
		float distancia;
		
		System.out.print("Insira a velocidade ");
		velocidade = Teclado.leFloat();
		
		System.out.print("Insira a dist�ncia percorrida ");
		distancia = Teclado.leFloat();
		
		System.out.println("O tempo gasto foi de "+(distancia/velocidade)+"h.");
	}

	// Pergunte para o usu�rio a quantidade consumida de alimentos.
	// Calcule e mostre o total de calorias ingeridas. Assuma as seguintes calorias.
	// 1 Bife = 300 KCal
	// 1 p�o  =  40 KCal
	// 100g arroz = 50 KCal
	// 100g feij�o = 60 KCal
	void ex04(){
		System.out.println("Quantidade de bifes ");
		int qntBifes = Teclado.leInteiro();
		
		System.out.println("Quantidade de p�es ");
		int qntPaes = Teclado.leInteiro();
		
		System.out.println("Quantidade de arroz ");
		int qntArroz = Teclado.leInteiro();
		
		System.out.println("Quantidade de feij�o ");
		int qntFeijao = Teclado.leInteiro();
		
		float calorias = qntBifes*300 + qntPaes*40 + (qntArroz*50)/100 + (qntFeijao*60)/100;
		
		System.out.println("A quantidade de calorias ingeridas � de "+calorias);
	}
}

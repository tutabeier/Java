
public class Exercicios_03 {

	public static void main(String[] args) {
		Exercicios_03 exercicio = new Exercicios_03();
		
		exercicio.ex04();
	}
	
	// 1) Ler o salário bruto de um funcionário e imprimir:
	// - o valor do INSS (8% do salário bruto).
	// - o salário líquido.
	void ex01 () {
		float salarioBruto, inss;
		System.out.print("Insira o salário bruto do funcionário: ");
		salarioBruto = Teclado.leFloat();
		inss = salarioBruto*(0.08f);
		
		System.out.println("O valor do INSS é de R$"+inss);
		System.out.println("O salário liquido é de R$"+(salarioBruto-inss));
	}

	// 2) Ler o salário bruto de um funcionário e imprimir:
	//	 - o valor do INSS (8% do salário bruto).
	//	 - o valor do IR   (10% do salário base).
	//	 - o salário líquido (sal. liq. = sal bruto - inss - IR).
	void ex02 () {
		float salarioBruto, inss, ir, salarioLiquido;
		System.out.print("Insira o salário bruto do funcionário: ");
		
		salarioBruto = Teclado.leFloat();
		inss = salarioBruto*(0.08f);
		ir = (salarioBruto-inss)*(0.1f);
		salarioLiquido = salarioBruto - inss - ir;
		
		System.out.println("O valor do INSS é de R$"+inss);
		System.out.println("O valor do IR é de R$"+ir);
		System.out.println("O salário líquido é de R$"+salarioLiquido);
	}

	// 3) Ler o salário bruto de um funcionário, a taxa do INSS e a taxa do IR. 
	// Mostrar os seguintes resultados:
	//  - o valor do INSS (tx de INSS sobre o salário bruto).
	//  - o valor do IR   (tx de IR sobre o salário base).
	//  - o salário líquido.
	void ex03 () {
		float salarioBruto, inss, ir, salarioLiquido;
		
		System.out.print("Insira o valor do salário bruto: ");
		salarioBruto = Teclado.leFloat();
		
		System.out.print("Insira a porcentagem do INSS: ");
		inss = Teclado.leFloat();
		
		System.out.print("Insira o valor do salário IR: ");
		ir = Teclado.leFloat();
		
		inss = salarioBruto*(inss/100);
		ir = (salarioBruto-inss)*(ir/100);
		salarioLiquido = salarioBruto - inss - ir;
		
		System.out.println("O valor do INSS é de R$"+inss);
		System.out.println("O valor do IR é de R$"+ir);
		System.out.println("O valor do salário líquido é de R$"+salarioLiquido);		
	}

	//	4) Pedir para o usuário informar os lados de uma sala retangular (largura e comprimento). 
	//
	//	a) Calcular a área dessa sala.
	//	b) Calcular a diagonal dessa sala. 
	//	c) sabendo que o m2 do parquet custa R$ 15,00, calcule e mostre o custo para cobrir o piso da sala com parquet.
	//	d) Será colocado um fio atravessando a diagonal da sala. Sabendo que o custo desse fio é de R$ 20,00 o metro, calcule
	// 	   e mostre o custo.
	//	e) Mostre o custo total dessa sala: custo com parquet + custo com fio.
	void ex04() {
		double largura, comprimento, area, diagonal, custoPiso, custoFio, custoTotal;
		
		System.out.print("Digite a largura da sala: ");
		largura = Teclado.leFloat();
		
		System.out.println("Digite o comprimento da sala: ");
		comprimento = Teclado.leFloat();
		
		area = largura*comprimento;
		diagonal = Math.pow((Math.pow(largura, 2) + Math.pow(comprimento, 2)), 0.5);
		custoPiso = area*15;
		custoFio = diagonal*20;
		custoTotal = custoFio + custoPiso;
		
		System.out.println("Área: "+area);
		System.out.println("Diagonal: "+diagonal);
		System.out.println("Custo piso: "+custoPiso);
		System.out.println("Custo fio: "+custoFio);
		System.out.println("Custo total: "+custoTotal);
	}
}

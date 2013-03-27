
public class Exercicios_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercicios_01 exercicio = new Exercicios_01();
		exercicio.ex04();
	}
	
	// 1) O preço do metro quadrado de lajota custa R$ 15,00. Um cliente comprou 
	// 20 metros quadrados de lajota. Calcule e mostre o valor pago.
	void ex01() {		
		float precoMetroQuadradoLajota = 15.00f;
		float qntdMetroQuadradoLajota = 20.00f;
		
		System.out.println("O valor pago é de R$"+(precoMetroQuadradoLajota*qntdMetroQuadradoLajota));
	}
	
	// 2) Uma sala mede 6m x 8m. Calcule e mostre a área dessa sala.
	void ex02() {		
		float largura = 6.00f;
		float profundidade = 8.00f;
		
		System.out.println("A área é de "+(largura*profundidade)+"m².");
	}
	
	// 3) Um cliente deseja colocar lajotas em uma sala que mede 6m x 8m. O preço do metro quadrado de lajota custa R$ 15,00.
	// Calcule e mostre quantos metros quadrados de lajota são necessários e também o custo total:
	void ex03() {		
		float largura = 6.00f;
		float profundidade = 8.00f;
		float precoMetroQuadradoLajota = 15.00f;
		float areaTotal = largura*profundidade;
		float custoTotal = areaTotal*precoMetroQuadradoLajota;
		
		System.out.println("A área total é de "+areaTotal+"m².");
		System.out.println("O custo total é de R$"+custoTotal+".");
	}

	// 4) Um cliente deseja colocar lajotas em uma sala que mede 6m x 8m.
	// O preço do metro quadrado de lajota custa R$ 15,00.  Cada lajota mede 1m x 2m. Calcule e mostre:
	// Tamanho da sala:
	// Quantidade de lajotas necessárias:
	// Custo Total:
	void ex04() {
		float largura = 6.00f;
		float profundidade = 8.00f;
		float precoMetroQuadradoLajota = 15.00f;
		float areaTotal = largura*profundidade;
		float custoTotal = areaTotal*precoMetroQuadradoLajota;
		float tamanhoDaSala = largura*profundidade;
		
		System.out.println("A ára total é de "+tamanhoDaSala+".");
		System.out.println("Quantidade de lajotas "+(tamanhoDaSala/2)+".");
		System.out.println("O custo total é de R$"+custoTotal+".");
	}
}

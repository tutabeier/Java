package ExercicioFuncionario1b;

public class Funcionario {
	private String nome;
	private char sexo;
	private int idade;
	private float salario;
	private float vendas;
	
	public Funcionario(String nome, char sexo, int idade, float salario, float vendas) {
		this.setNome(nome);
		this.setSexo(sexo);
		this.setIdade(idade);
		this.setSalario(salario);
		this.setVendas(vendas);
	}
	
	public String toString() {
		return this.getNome()+", "+this.getSexo()+", "+this.getIdade()+", "+this.getSalario()+", "+this.aliquotaINSS()*100+"%, "+this.valorINSS()+", "+this.salarioLiquido()+", "+this.getVendas()+", "+this.valorComissao();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getVendas() {
		return vendas;
	}

	public void setVendas(float vendas) {
		this.vendas = vendas;
	}

	/**
	 * Método que seta a alíquota.
	 * @return float
	 */
	public float aliquotaINSS() {
		float aliquotaINSS;
		
		if(this.getSalario() <= 1000.00) {
			aliquotaINSS = .08f;
		} else if ((this.getSalario() >= 1000.01) && (this.getSalario() <= 2000.00)) {
			aliquotaINSS = .09f;
		} else {
			aliquotaINSS = .10f;
		}
		
		return aliquotaINSS;
	}
	
	/**
	 * Calcula o valor do INSS com base na alíquota.
	 * @return float
	 */
	public float valorINSS() {
		float valorINSS;
		float aliquotaINSS;
		
		aliquotaINSS = aliquotaINSS();
		valorINSS = (this.salarioBruto()*aliquotaINSS);
		
		return valorINSS;
	}
	
	/**
	 * Calcula o valor do salário líquido.
	 * @return float
	 */
	public float salarioLiquido() {
		float salarioLiquido;
		
		salarioLiquido = this.salarioBruto() - valorINSS();
		
		return salarioLiquido;
	}
	
	/**
	 * Aumenta o salário do funcionário com base no aumento passado.
	 * @param aumento
	 */
	public void aumentaSalario(float aumento) {
		float novoSalario;
		salario = this.getSalario();
		
		novoSalario = salario + salario*(aumento/100);
		this.setSalario(novoSalario);
	}

	public float valorComissao() {
		return this.getVendas()*0.01f;
	}

	public float salarioBruto() {
		return this.getSalario()+valorComissao();
	}
}

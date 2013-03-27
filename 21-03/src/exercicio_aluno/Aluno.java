package exercicio_aluno;

public class Aluno {
	private String sexo;
	private int idade;
	private String nome;
	private double nota1, nota2;
	
	// GETTERS E SETTERS
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		if(sexo.equals("m") || sexo.equals("M") || sexo.equals("f") || sexo.equals("F")) {
			this.sexo = sexo;
		}
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if(idade > 0) {
			this.idade = idade;
		}		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.length() >= 3) {
			this.nome = nome;
		}		
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		if(nota1 >= 0 && nota1 <= 10) {
			this.nota1 = nota1;
		}
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		if(nota2 >= 0 && nota2 <= 10) {
			this.nota2 = nota2;
		}
	}
	
	public Aluno(String nome, int idade, String sexo, double nota1, double nota2) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setNota1(nota1);
		this.setNota2(nota2);
	}
	
	public String toString() {
		String string;
		
		string  = "Nome: "+this.getNome()+"\n";
		string += "Idade: "+this.getIdade()+"\n";
		string += "Sexo: "+this.getSexo()+"\n";
		string += "Nota1: "+this.getNota1()+"\n";
		string += "Nota2: "+this.getNota2()+"\n";
		string += "Media: "+this.media()+"\n";
		string += "Situação: "+this.situacao()+"\n";
		
		return string;
	}
	
	public double media() {
		double media;
		media = (this.getNota1() + this.getNota2())/2;
		
		return media;
	}
	
	public String situacao() {
		double media = this.media();
		String situacao = "";
		
		if(media < 3) {
			situacao = "Reprovado";
		}
		
		if(media >= 3 && media < 7) {
			situacao = "Recuperacao";
		}
		
		if(media >= 7 && media < 9) {
			situacao = "Aprovado Bom";
		}
		
		if(media >= 9) {
			situacao = "Aprovado Otimo";
		}
		
		return situacao;
	}
	
	
}// Aluno

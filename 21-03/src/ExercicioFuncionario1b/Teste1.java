package ExercicioFuncionario1b;
import ExercicioFuncionario1b.Funcionario;

public class Teste1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funcionario arrayFuncionario[] = new Funcionario[5];
		arrayFuncionario[0] = new Funcionario("João", 'M', 30, 600, 1000);
		arrayFuncionario[1] = new Funcionario("Pedro", 'M', 40, 1700, 1400);
		arrayFuncionario[2] = new Funcionario("Maria", 'F', 35, 1600, 900);
		arrayFuncionario[3] = new Funcionario("Paulo", 'M', 40, 2600, 1600);
		arrayFuncionario[4] = new Funcionario("Joana", 'F', 45, 900, 1100);
		
		for (Funcionario funcionario: arrayFuncionario) {
			System.out.println(funcionario.toString());
		}
		
		System.out.println("\n ou \n");
		
		for (int i = 0; i < arrayFuncionario.length; i++) {
			System.out.println(arrayFuncionario[i].toString());
		}
	}
}

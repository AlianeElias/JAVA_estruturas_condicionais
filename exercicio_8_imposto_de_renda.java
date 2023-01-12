package estudos_programacao;
import java.util.Scanner;

public class exercicio_8_imposto_de_renda {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Qual o seu salário em Lisarb?");
	double salario = sc.nextDouble();
	
	if (salario >= 0 && salario <= 2000) {
		System.out.println("O imposto de renda para esse salário é ISENTO.");
	}
	
	else if (salario <= 3000) {
		double imposto = ((salario - 2000) * 0.08);
		System.out.printf("O imposto de renda para esse salário é: R$ %.2f %n", imposto);
		// o que sobra de -2000 é multiplicado pela porcentagem da sua própria categoria.
	}
	
	else if (salario <= 4500) {
		double imposto = ((salario - 3000) * 0.18) + (1000 * 0.08);
		System.out.printf("O imposto de renda para esse salarío é: R$ %.2f %n", imposto);
		// é 1000 com 0.08 porque é a diferença entre os 2000 e 3000 anteriores.
	}
	
	else if (salario > 4500) {
		double imposto = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
		System.out.printf("O imposto de renda para esse salarío é: R$ %.2f %n", imposto);
		// é 1000 com 0.08 e 1500 com 0.18 porque é a diferença entre os 2000 e 3000 anteriores e os 3000 e 4500 anteriores.
	}
	
	sc.close();
	}
}
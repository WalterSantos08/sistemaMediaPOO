package sistemaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Tela {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do Aluno(a): ");
		String nome = sc.nextLine();
		System.out.println("Nota do primeiro Trimestre: ");
		double nota1 = sc.nextDouble();
		System.out.println("Nota do segundo Trimestre: ");
		double nota2 = sc.nextDouble();
		System.out.println("Nota do terceiro Trimestre: ");
		double nota3 = sc.nextDouble();
		
		Estudante estudante = new Estudante(nome,nota1,nota2,nota3);
		Media.resultado(estudante);
		
		sc.close();

	}

}

package sistemaMedia;

public class Media {
	public static void resultado(Estudante estudante) {
		System.out.println(estudante.pegaNome());
		System.out.printf("Nota Final = %.2f%n", estudante.notaFinal());
		if (estudante.aprovado()) {
			System.out.println("Aprovado!");
			System.out.println();
		}else {
			System.out.println("Reprovado!");
			System.out.println();
			System.out.printf("Faltaram %.2f Pontos", estudante.pontosPerdido());
		}
	}
}


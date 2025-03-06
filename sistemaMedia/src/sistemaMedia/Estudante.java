package sistemaMedia;

public class Estudante {
	private String nome;
	private double nota1,nota2,nota3;
	
	public Estudante(String nome, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public boolean aprovado() {
		return notaFinal() >= 60.0;
	}
	
	public double pontosPerdido() {
		return aprovado() ? 0.0 : 60.0 - notaFinal();
	}
	
	public String pegaNome() {
		return nome;
	}
	
	
	

}

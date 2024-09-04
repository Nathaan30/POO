package iesb.poo.lista.exercicio.revisao;

public class Orientador {
	public int id;
	public String nome;
	public String materias;
	protected double salario;
	public String orientandos;
	
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public Orientador() {
		
	}

}

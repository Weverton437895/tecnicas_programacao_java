package modelo;

public class Calculadora implements IOperacaoMatematica {
	
	private int num1;
	private int num2;
	
	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int soma() {
		return num1 + num2;
	}
	
	public int subtracao() {
		return num1 - num2;
	}
	
	public int multiplicacao() {
		return num1 * num2;
	}
	
	public int divisao() {
		if(num2 == 0) {
			 System.out.println("Erro: divisão por zero!");
		        return 0;
		} else {
			return num1/num2;
		}
	}
	
	
}

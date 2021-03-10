package br.faesa.gui;

public class CalculadoraOp {
	private static StringBuffer operando = new StringBuffer();
	private static StringBuffer expressao = new StringBuffer();
	private static String operacao;
	private static String digito;
	private static Double resultado;
	
	public static void coletaOperando(){
		operando.append(digito);
		expressao.append(digito);
	}
	
	public static void montaExpressao(){
		expressao.append(operacao);
		operando = new StringBuffer("");
	}
	
	public static void efetuaCalculo(){
		Double v1 = Double.valueOf(expressao.substring(0, expressao.indexOf(operacao)));
		System.out.println("v1 = "+v1);
		Double v2 = Double.valueOf(expressao.substring(expressao.indexOf(operacao)+1, 
															expressao.length()));
		System.out.println("v2 = "+v2);
		switch (operacao) {
		case "+":
			resultado = v1 + v2;
			break;
		case "-":
			resultado = v1 - v2;
			break;
		case "X":
			resultado = v1 * v2;
			break;
		case "/":
			resultado = v1 / v2;
			break;

		default:
			break;
		}
		System.out.println("resultado: "+resultado);
		operando = new StringBuffer(String.valueOf(resultado));
		expressao = new StringBuffer();
	}
	
	
	// getters & setters	
	public static StringBuffer getOperando() {
		return operando;
	}
	public static void setOperando(StringBuffer operando) {
		CalculadoraOp.operando = operando;
	}
	public static StringBuffer getExpressao() {
		return expressao;
	}
	public static void setExpressao(StringBuffer expressao) {
		CalculadoraOp.expressao = expressao;
	}
	public static String getOperacao() {
		return operacao;
	}
	public static void setOperacao(String operacao) {
		CalculadoraOp.operacao = operacao;
	}
	public static String getDigito() {
		return digito;
	}
	public static void setDigito(String digito) {
		CalculadoraOp.digito = digito;
	}
	public static Double getResultado() {
		return resultado;
	}
	public static void setResultado(Double resultado) {
		CalculadoraOp.resultado = resultado;
	}
	
	

	
	
}

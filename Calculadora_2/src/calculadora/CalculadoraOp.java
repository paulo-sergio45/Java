package calculadora;

import javax.swing.JOptionPane;

public class CalculadoraOp {

    private static StringBuffer operando = new StringBuffer();
    private static StringBuffer expressao = new StringBuffer();
    private static StringBuffer expressao2 = new StringBuffer();
    private static String operacao;
    private static String operacao2;

    private static String digito;
    private static Double resultado = 0.0;
    private static Double resultadof = 0.0;
    private static int multi;

    public static void coletaOperando(String chave) {
        operando.append(chave);
        expressao.append(chave);
    }

    public static void montaExpressao(String chave) {
        expressao.append(chave);
        expressao2.append(chave);
        operando = new StringBuffer("");

    }
    
  


    public static void coletaOperando() {
        operando.append(digito);
        expressao.append(digito);
        expressao2.append(digito);
    }

    public static void montaExpressao() {
        expressao.append(operacao);
        expressao2.append(operacao);
        operando = new StringBuffer("");

    }

    public static void efetuaCalculomaismenos(StringBuffer expressao1) {
  
        Double v1 = 0.0;
        Double v2 = 0.0;

         if (expressao1.substring(0, 1).contains("-")) {
            expressao1.delete(0, 1);
            expressao1.append("-0");
            System.out.println("operacao"+ operacao);
            System.out.println(expressao1.indexOf(operacao));
            v1 = Double.valueOf(expressao1.substring(0, expressao1.indexOf(operacao)));
            System.out.println("v1 = " + v1);
            v1 = v1 * (-1);

            v2 = Double.valueOf(expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()));
            System.out.println("v2 = " + v2);
        } else {
           if (expressao1.substring(0, expressao1.indexOf(operacao)).equals("l")
                || expressao1.substring(0, expressao1.indexOf(operacao)).equals("r")
                || expressao1.substring(0, expressao1.indexOf(operacao)).equals("^")) {
            StringBuffer opa = new StringBuffer(expressao1.substring(0, expressao1.indexOf(operacao)));
            operacao2 = operacao;
            v1 = CalculadoraOp.efetuaESeparaCalculo(opa);
            operacao = operacao2;

        } else {
            v1 = Double.valueOf(expressao1.substring(0, expressao1.indexOf(operacao)));
            System.out.println("v1 = " + v1);
        }}
           if (expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()).equals("l")
                || expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()).equals("r")
                || expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()).equals("^")) {
            StringBuffer opa = new StringBuffer(expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()));
            operacao2 = operacao;
            v2 = CalculadoraOp.efetuaESeparaCalculo(opa);
            operacao = operacao2;

        } else {
            v2 = Double.valueOf(expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()));
            System.out.println("v2 = " + v2);
        }
        
        
        switch (operacao) {
            case "+":
                resultado = v1 + v2;
                operacao = null;
                break;
            case "-":
                resultado = v1 - v2;
                operacao = null;
                break;

            default:
                resultado = v1;
                break;
        }

        operando = new StringBuffer(String.valueOf(resultado));
        expressao = new StringBuffer();
        expressao1 = new StringBuffer();

    }

    public static void efetuaCalculovezdiv(StringBuffer expressao1)  {

        Double v1 = 0.0;
        Double v2 = 0.0;

        if (expressao1.substring(0, expressao1.indexOf(operacao)).equals("1")
                || expressao1.substring(0, expressao1.indexOf(operacao)).equals("r")
                || expressao1.substring(0, expressao1.indexOf(operacao)).equals("^")) {
            StringBuffer opa = new StringBuffer(expressao1.substring(0, expressao1.indexOf(operacao)));
            operacao2 = operacao;
            v1 = CalculadoraOp.efetuaESeparaCalculo(opa);
            operacao = operacao2;

        } else {
            v1 = Double.valueOf(expressao1.substring(0, expressao1.indexOf(operacao)));
            System.out.println("v1 = " + v1);
        }

        if (expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()).equals("l")
                || expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()).equals("r")
                || expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()).equals("^")) {
            StringBuffer opa = new StringBuffer(expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()));
            operacao2 = operacao;
            v2 = CalculadoraOp.efetuaESeparaCalculo(opa);
            operacao = operacao2;

        } else {
             System.out.println("+1 = "+ expressao1.indexOf(operacao) + 1);
             System.out.println("length = "+ expressao1.length());
            v2 = Double.valueOf(expressao1.substring(expressao1.indexOf(operacao) + 1, expressao1.length()));
            System.out.println("v2 = " + v2);
        }
        
   
         
        switch (operacao) {

            case "*":
                resultado = v1 * v2;
                operacao = null;
                break;
            case "/":
                resultado = v1 / v2;
                operacao = null;
                break;

            default:
                resultado = v1;
                break;
        }

        operando = new StringBuffer(String.valueOf(resultado));
        expressao = new StringBuffer();
        expressao1 = new StringBuffer();

    }

    public static Double efetuaCalculoRaiz(Double nbase, Double eindr) {
       
        return Math.pow(nbase, 1 / eindr);

    }

    public static Double efetuaCalculoLog(Double nbase, Double nlogari) {
        Double novo10;
        novo10 = Math.log10(nlogari) / Math.log10(nbase);
        return novo10;

    }

    public static Double efetuaCalculoPotencia(Double nbase, Double exp) {
        Double n;
        n = Math.pow(nbase, exp);
        return n;

    }

    public static Double efetuaESeparaCalculo(StringBuffer expressao)  {

        String exp = expressao.substring(0, expressao.length());
        String[] exp2 = exp.split("\\(|\\)");
        StringBuffer po = new StringBuffer();
        int i = 0;

        po.append(exp2[exp2.length - 1]);

        
        
        for (i = exp2.length - 1; i >= 0; i--) {

            if (exp2[i].contains("*") && exp2[i] != null) {
                operacao = "*";
                CalculadoraOp.efetuaCalculovezdiv(po);
                CalculadoraOp.resultadof = CalculadoraOp.resultado;
                CalculadoraOp.expressao.append(resultadof);

                po = null;
                if (i - 1 > -1) {
                    StringBuffer poo = new StringBuffer(exp2[i - 1]);
                    poo.append(resultadof);
                    po = poo;
                }
            } else if (exp2[i].contains("/") && exp2[i] != null) {
                operacao = "/";
                CalculadoraOp.efetuaCalculovezdiv(po);
                CalculadoraOp.resultadof = CalculadoraOp.resultado;
                CalculadoraOp.expressao.append(resultadof);

                po = null;
                if (i - 1 > -1) {
                    StringBuffer poo = new StringBuffer(exp2[i - 1]);
                    poo.append(resultadof);
                    po = poo;
                }
            } else if (exp2[i].contains("+") && exp2[i] != null) {
                operacao = "+";
                CalculadoraOp.efetuaCalculomaismenos(po);

                CalculadoraOp.resultadof = CalculadoraOp.resultado;

                CalculadoraOp.expressao.append(resultadof);

                po = null;
                if (i - 1 > -1) {
                    StringBuffer poo = new StringBuffer(exp2[i - 1]);
                    poo.append(resultadof);
                    po = poo;
                }
            } else if (exp2[i].contains("-") && exp2[i] != null) {
                operacao = "-";

                CalculadoraOp.efetuaCalculomaismenos(po);

                CalculadoraOp.resultadof = CalculadoraOp.resultado;
                CalculadoraOp.expressao.append(resultadof);

                po = null;
                if (i - 1 > -1) {
//                   CalculadoraOp.efetuaCalculomaismenos(exp2[i - 1]); 
//                  CalculadoraOp.resultadof = CalculadoraOp.resultado;
//                  CalculadoraOp.expressao.append(resultadof);
//olhar aki
//
                    StringBuffer poo = new StringBuffer(exp2[i - 1]);
                    poo.append(resultadof);
                    po = poo;
                }
            } else if (exp2[i].contains("l")) {

                operacao = "l";
                resultadof = CalculadoraOp.efetuaCalculoLog(Double.valueOf(po.substring(0, po.indexOf(operacao))),
                        Double.valueOf(po.substring(po.indexOf(operacao) + 1, po.length())));

                CalculadoraOp.expressao.append(resultadof);

                po = null;
                if (i - 1 > -1) {
                    StringBuffer poo = new StringBuffer(exp2[i - 1]);
                    poo.append(resultadof);
                    po = poo;
                }
            } else if (exp2[i].contains("r")) {

                operacao = "r";
                resultadof = CalculadoraOp.efetuaCalculoRaiz(Double.valueOf(po.substring(0, po.indexOf(operacao))),
                        Double.valueOf(po.substring(po.indexOf(operacao) + 1, po.length())));

                CalculadoraOp.expressao.append(resultadof);

                po = null;
                if (i - 1 > -1) {
                    StringBuffer poo = new StringBuffer(exp2[i - 1]);
                    poo.append(resultadof);
                    po = poo;
                }
            } else if (exp2[i].contains("^")) {

                operacao = "^";
                resultadof = CalculadoraOp.efetuaCalculoPotencia(Double.valueOf(po.substring(0, po.indexOf(operacao))),
                        Double.valueOf(po.substring(po.indexOf(operacao) + 1, po.length())));

                CalculadoraOp.expressao.append(resultadof);

                po = null;
                if (i - 1 > -1) {
                    StringBuffer poo = new StringBuffer(exp2[i - 1]);
                    poo.append(resultadof);
                    po = poo;
                }

            } else {
            }


        }
        return resultadof;
    }
	
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

    public static StringBuffer getExpressao2() {
        return expressao2;
    }

    public static void setExpressao2(StringBuffer aExpressao2) {
        expressao2 = aExpressao2;
    }

    public static Double getResultadof() {
        return resultadof;
    }

    public static void setResultadof(Double aResultadof) {
        resultadof = aResultadof;
    }

    public static int getMulti() {
        return multi;
    }

    public static void setMulti(int aMulti) {
        multi = aMulti;
    }

    public static String getOperacao2() {
        return operacao2;
    }

    public static void setOperacao2(String aOperacao2) {
        operacao2 = aOperacao2;
    }

   

}

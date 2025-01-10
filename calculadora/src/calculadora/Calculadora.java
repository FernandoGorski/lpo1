/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Fernando Guilherme Gorski GRR20223817
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    
    private double numero1;
    private double numero2;
    private double resultado;
    private Estado estado;
    private String operador;

    public enum Estado {
        INICIAL, IGNORADO, ENTRADA1, OPERADOR, ENTRADA2, CALCULANDO
    }
    
    public Calculadora() {
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
        estado = Estado.INICIAL;
        operador = "";
    }
    
    public void numero(double numero) {
        if (estado == Estado.ENTRADA1) {
            numero1 = (numero1 * 10) + numero;
        } else if (estado == Estado.ENTRADA2) {
            numero2 = (numero2 * 10) + numero;
        } else {
            estado = Estado.ENTRADA1;
            numero1 = numero;
        }
    }

    public void operador(String operador) {
        if (estado == Estado.ENTRADA1) {
            estado = Estado.OPERADOR;
            this.operador = operador;
        } else if (estado == Estado.ENTRADA2) {
            calcular();
            estado = Estado.OPERADOR;
            this.operador = operador;
        }
    }

    public void igual() {
        if (estado == Estado.ENTRADA2 || estado == Estado.CALCULANDO) {
            calcular();
            estado = Estado.CALCULANDO;
        }
    }

    public void calcular() {
        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
        }
        numero1 = resultado;
        numero2 = 0;
    }

    public double getResultado() {
        return resultado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
}
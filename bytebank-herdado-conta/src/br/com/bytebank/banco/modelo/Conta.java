/**
 * Classe representa moldura de uma conta
 * @author Izabele Sanches
 */

package br.com.bytebank.banco.modelo;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e n�mero
     * @param agencia
     * @param numero
     */    
    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    
    /**
     * Valor precisa ser menor ou igual ao saldo
     * @param valor
     */
    public void saca(double valor) {
        if (this.saldo < valor) {
        	throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
    @Override
	public String toString() {
		return "N�mero: " + this.numero + " - Ag�ncia: " + this.agencia;
	}

}
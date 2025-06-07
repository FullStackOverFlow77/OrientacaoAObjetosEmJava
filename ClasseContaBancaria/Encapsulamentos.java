package ClasseContaBancaria;

public class Encapsulamentos {
    private String titular; 
    private int numero; 
    private double saldo; 


public Encapsulamentos(String titular, int numero){
    this.titular = titular; 
    this.numero = numero;
}

public Encapsulamentos(String titular, int numero , double saldo){
    this.titular = titular; 
    this.numero = numero; 
    this.saldo = saldo; 
}

public void setTitular(String titular){
    this.titular = titular; 
}

public String getTitular(){
    return titular;
}

public void setNumero(int numero){
    this.numero = numero; 
}

public int getNumero(){
    return numero;
}


public double getSaldo() {
    return saldo;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}
}
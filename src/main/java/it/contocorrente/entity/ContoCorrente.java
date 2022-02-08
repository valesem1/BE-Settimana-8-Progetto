package it.contocorrente.entity;

public class ContoCorrente {

	
	private String iban;
	private String intestatario;
	private double saldo;
	private String dataCreazione;
	
	//Getter
	
	
	public String getDataCreazione() {return dataCreazione;}
	
	public String getIban() {return iban;}
	
	public double getSaldo() {return saldo;}
	
	public String getIntestatario() {return intestatario;}
	
	//Setter
	
	public void setDataCreazione(String dataCreazione) {this.dataCreazione = dataCreazione;}
	
	public void setIban(String iban) {this.iban = iban;}
	
	public void setSaldo(double saldo) {this.saldo = saldo;}
	
	public void setIntestatario(String intestatario) {this.intestatario = intestatario;}




}

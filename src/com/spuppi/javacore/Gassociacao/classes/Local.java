package com.spuppi.javacore.Gassociacao.classes;

public class Local {

	private String rua, bairro;
	
	public Local() {
		
	}
	public Local(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}
	
	public void imprimir() {
		System.out.println(this.rua);
		System.out.println(this.bairro);
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}

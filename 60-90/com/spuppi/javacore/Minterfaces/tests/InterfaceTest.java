package com.spuppi.javacore.Minterfaces.tests;

import com.spuppi.javacore.Minterfaces.classes.Produto;

public class InterfaceTest {

	public static void main(String[] args) {
		Produto p = new Produto("Notebook",4,3000);
		p.calcularImposto();
		p.calcularFrete();
		
		System.out.println(p);
	}

}

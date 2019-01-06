package com.spuppi.javacore.Lclassesabstratas.tests;

import com.spuppi.javacore.Lclassesabstratas.classes.Gerente;
import com.spuppi.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
	
	public static void main(String[] args) {
		Gerente g = new Gerente("Ana","111.222.333-44", 2000);
		Vendedor v = new Vendedor("Camila","111.222.333-44", 1500, 5000);
		
		v.calculaSalario();
		g.calculaSalario();
		
		System.out.println(v);
		System.out.println(g);
		
		
	}

}

package com.spuppi.javacore.Bintroducaometodos.tests;

import javax.swing.JOptionPane;

import com.spuppi.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		Professor professor = new Professor();
		
		professor.nome = JOptionPane.showInputDialog("Insira o nome do professor");
		professor.matricula = "3336107";
		professor.rg = "41.444.495-7";
		professor.cpf = "323.258.856-95";
		
		professor.imprimir();

	}

}

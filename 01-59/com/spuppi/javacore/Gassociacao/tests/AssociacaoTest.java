package com.spuppi.javacore.Gassociacao.tests;


import com.spuppi.javacore.Gassociacao.classes.Aluno;
import com.spuppi.javacore.Gassociacao.classes.Local;
import com.spuppi.javacore.Gassociacao.classes.Professor;
import com.spuppi.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {

	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Sullyvan", 32);
		Aluno aluno2 = new Aluno("Louro José", 99);
		
		Seminario seminario = new Seminario("Como ser um baita programador!");
		Professor professor = new Professor("Yoda","Usar a força para programar.");
		Local local = new Local("Rua das Araras","Matão");
		
		aluno1.setSeminario(seminario);
		aluno2.setSeminario(seminario);
		
		seminario.setProfessor(professor);
		seminario.setLocal(local);
		seminario.setAlunos(new Aluno[] {aluno1, aluno2});
		
		Seminario[] semArray = new Seminario[1];
		semArray[0] = seminario;
		professor.setSeminarios(semArray);
		
		seminario.imprimir();
		professor.imprimir();
		local.imprimir();
	}
	
}

package com.spuppi.javacore.Npolimorfismo.tests;

import com.spuppi.javacore.Npolimorfismo.classes.ArquivoDAO;
import com.spuppi.javacore.Npolimorfismo.classes.DataBaseDAO;
import com.spuppi.javacore.Npolimorfismo.classes.iDAO;

public class DAOtest {
	
	public static void main(String[] args) {
		iDAO arquivoDAO = new DataBaseDAO();
		arquivoDAO.save();
	}

}

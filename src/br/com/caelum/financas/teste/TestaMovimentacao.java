package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaMovimentacao {
	
	public static void main(String[] args) {
		
	EntityManager manager = new JPAUtil().getEntityManager();
	
	Movimentacao movimentacao = new Movimentacao();
	
	}

}

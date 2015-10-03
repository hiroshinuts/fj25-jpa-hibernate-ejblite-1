package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaBuscaContaDaMovimentacao {
	
	public static void main(String[] args) {
		
	EntityManager manager = new JPAUtil().getEntityManager();
	manager.getTransaction().begin();
	MovimentacaoDao dao = new MovimentacaoDao(manager);
	
	
	Movimentacao movimentacao = manager.getReference(Movimentacao.class, 4);
	
	System.out.println(movimentacao.getConta().getTitular());
	
	
	
	
	}

}

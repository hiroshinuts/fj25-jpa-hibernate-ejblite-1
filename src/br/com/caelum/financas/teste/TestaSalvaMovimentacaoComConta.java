package br.com.caelum.financas.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.Movimentacao.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaSalvaMovimentacaoComConta {
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		MovimentacaoDao dao = new MovimentacaoDao(manager);
		
		Conta conta = new Conta();
		conta.setBanco("Banco do Hi");
		conta.setNumero("123-123");
		conta.setAgencia("123");
		conta.setTitular("Hiroww");
		manager.persist(conta);
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setConta(conta);
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("Comprando Pacoca");
		movimentacao.setValor(new BigDecimal("26.26"));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		
		dao.adiciona(movimentacao);
		manager.getTransaction().commit();
		manager.close();
		
	}

}

package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaInsereConta {
	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		
		ContaDao dao = new ContaDao(manager);
		
		Conta conta = new Conta();
		conta.setTitular("Rafa123456");
		conta.setBanco("Banco do Br");
		conta.setNumero("12345-6");
		conta.setAgencia("0909");
		
		manager.getTransaction().begin();
		manager.persist(conta);
		manager.getTransaction().commit();
		manager.close();
		
		System.out.println("Conta Gravada com sucesso!");
		
	}
}

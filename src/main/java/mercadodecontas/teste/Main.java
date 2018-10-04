package mercadodecontas.teste;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mercadodecontas.model.FatoFinanceiro;
import mercadodecontas.model.Pessoa;
import mercadodecontas.model.enums.Status;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mercadoPU");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trx = manager.getTransaction();
		
		trx.begin();

		Pessoa bruno = new Pessoa();
		bruno.setNome("Bruno Maia");
		bruno.setCpf("973272163-20");
		
		
		FatoFinanceiro fato = new FatoFinanceiro();
		fato.setData(new Date());
		fato.setResponsavel(bruno);
		fato.setStatus(Status.EFETUADO);
		
		manager.persist(bruno);
		manager.persist(fato);
		
		trx.commit();
		
	}

}

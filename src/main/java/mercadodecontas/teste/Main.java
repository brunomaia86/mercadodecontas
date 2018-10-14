package mercadodecontas.teste;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mercadodecontas.model.FatoFinanceiro;
import mercadodecontas.model.Pessoa;
import mercadodecontas.model.enums.Status;
import mercadodecontas.model.enums.TipoFatoFinanceiro;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mercadoPU");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trx = manager.getTransaction();
		
		trx.begin();

		Pessoa bruno = new Pessoa();
		bruno.setNome("Bruno Maia");
		bruno.setLogin("brunomaia86");
		bruno.setEmail("brunomaia86@gmail.com");
		bruno.setCpf("97327216320");
		
		
		FatoFinanceiro fato = new FatoFinanceiro();
		fato.setData(new Date());
		fato.setResponsavel(bruno);
		fato.setStatus(Status.EFETUADO);
		fato.setTipoFatoFinanceiro(TipoFatoFinanceiro.PROVENTO);
		
		manager.persist(bruno);
		manager.persist(fato);
		
		trx.commit();
		
	}

}

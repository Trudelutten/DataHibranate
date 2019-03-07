package no.noroff.DataHibernate;

import no.noroff.DataHibernate.jpa.characterclasses;
import no.noroff.DataHibernate.jpa.characters;
import no.noroff.DataHibernate.jpa.players;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;


@SpringBootApplication
public class DataHibernateApplication {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("mamps");

	public static void main (String[] args) throws Exception {

		/*
		//Add a player to the database
		addPlayer("Ben", "Dover", "Bend", "Ben.Dover@gamer.com", "MyKitty4ever");
		//prints all the users in the Database
		for (players p: getAllPlayers()) {
			System.out.println(p.toString());
		}

		//Add a character to the database
		characters c = new characters(5, "name", 123, "Theif");
		addCharacter(c);
		for (characters cc: getAllCharacters()) {
			System.out.println(cc.toString());

		}*/

		SpringApplication.run(DataHibernateApplication.class, args);
	}

	public static List<players> getAllPlayers(){
		List<players> playerList = null;

		EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try{
			transaction = manager.getTransaction();
			transaction.begin();

			playerList = manager.createQuery("SELECT s FROM players s", players.class).getResultList();

			transaction.commit();
		}catch (Exception e){
			if(transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		finally {
			manager.close();
		}

		return playerList;
	}


	public static void addPlayer(players p){
		EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try{
			transaction = manager.getTransaction();
			transaction.begin();

			manager.persist(p);

			transaction.commit();
		}catch (Exception e){
			if(transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		finally {
			manager.close();
		}
	}

	public static List<characters> getAllCharacters(){
		List<characters> characterList = null;

		EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try{
			transaction = manager.getTransaction();
			transaction.begin();

			characterList = manager.createQuery("SELECT s FROM characters s", characters.class).getResultList();

			transaction.commit();
		}catch (Exception e){
			if(transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		finally {
			manager.close();
		}

		return characterList;
	}

	public static List<characterclasses> getAllCharacterClasses(){
		List<characterclasses> characterClassList = null;

		EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try{
			transaction = manager.getTransaction();
			transaction.begin();

			characterClassList = manager.createQuery("SELECT s FROM characterclasses s", characterclasses.class).getResultList();

			transaction.commit();
		}catch (Exception e){
			if(transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		finally {
			manager.close();
		}

		return characterClassList;
	}

	//Add character to DB
	public static void addCharacter(characters c){
		EntityManager manager =  ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try{
			transaction = manager.getTransaction();
			transaction.begin();

			manager.persist(c);

			transaction.commit();
		}catch (Exception e){
			if(transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		finally {
			manager.close();
		}
	}

}

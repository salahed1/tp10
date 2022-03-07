package ma.cigma.pfe.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ma.cigma.pfe.models.client;
@Repository


public class clientdaoimpl {
	
private EntityManager entitymanager;
	
    @Override
    public boolean save(client c) {
    	public void save(client p) {
    		entitymanager.persist(p);
    		}
    		public clientdaoimpl() {
    		System.out.println("creation bean dao");
    		}


}

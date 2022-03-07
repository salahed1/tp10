package ma.cigma.pfe.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.pfe.service.iclientservice;
import ma.cigma.pfe.dao.iclientdao;
import ma.cigma.pfe.models.client;
@Service
public class clientserviceimpl  implements iclientservice{
	@Autowired
	private iclientdao dao;
	public clientserviceimpl() {
	System.out.println("creation bean service");
	}
	public void save(client c) {
	dao.save(c);
	}


}

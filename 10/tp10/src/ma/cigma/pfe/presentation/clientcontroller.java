package ma.cigma.pfe.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ma.cigma.pfe.models.client;
import ma.cigma.pfe.service.iclientservice;
@Controller("ctrl1")
public class clientcontroller {
	@Autowired
	private iclientservice service;
	public void save(
			client person) {
	service.save(person);
	}
	public clientcontroller() {
	System.out.println("creation bean controller");
	}
	}


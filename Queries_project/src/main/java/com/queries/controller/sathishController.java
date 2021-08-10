package com.queries.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.queries.entity.sathisDetailsEntity;
import com.queries.repo.sathisDetailsRepo;

@RestController
public class sathishController {

	@Autowired
	private sathisDetailsRepo sathisDetailsrepo;
	
	@Autowired
	private EntityManager em;
	
	@GetMapping("/sathishnative")
	public sathisDetailsEntity demo() {
		
		javax.persistence.Query q = em.createNamedQuery("Country");
		//q.setParameter(1, "sathish");
		List a = q.getResultList();
		System.err.println("********createNamedQuery**********"+a);
		sathisDetailsEntity findDetails = sathisDetailsrepo.findDetailsnative(2);
		System.err.println("******************"+findDetails);
		
		return findDetails;
	}
	
	@GetMapping("/sathish")
	public sathisDetailsEntity demo1() {
		
		sathisDetailsEntity findDetails = sathisDetailsrepo.findDetails(2);
		System.err.println("******************"+findDetails);
		
		return findDetails;
	}
	
}

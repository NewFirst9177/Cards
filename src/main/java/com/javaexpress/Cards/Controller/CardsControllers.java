package com.javaexpress.Cards.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaexpress.Cards.Repository.CardRepository;
import com.javaexpress.Cards.models.Cards;
import com.javaexpress.Cards.models.Customer;


@RestController
public class CardsControllers {

	@Autowired
	private CardRepository cardRepository;
	
	
	@PutMapping("/myCards")
	public List<Cards> getALLLoansdetails(@RequestBody Customer customer) {
		Iterable<Cards> findAll = cardRepository.findByCustomerId(customer.getCustomerId());
		return (List<Cards>) findAll;
	}
}
 
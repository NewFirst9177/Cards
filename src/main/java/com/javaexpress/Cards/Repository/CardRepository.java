package com.javaexpress.Cards.Repository;

import org.springframework.data.repository.CrudRepository;

import com.javaexpress.Cards.models.Cards;

public interface CardRepository  extends CrudRepository<Cards, Integer>{

	Iterable<Cards> findByCustomerId(int customerId);

	
}

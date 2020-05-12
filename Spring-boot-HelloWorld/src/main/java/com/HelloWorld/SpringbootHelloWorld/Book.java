package com.HelloWorld.SpringbootHelloWorld;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

@Entity
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	
	@Column(nullable = false, unique = true)
    private String title;
	
	@Column(nullable = false)
    private String author;

}


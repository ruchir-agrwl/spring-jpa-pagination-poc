package com.poc.paginationpoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.poc.paginationpoc.service.PaginationService;

@Controller
public class PaginationPocController implements CommandLineRunner {
	
	@Autowired
	PaginationService pgService;

	@Override
	public void run(String... args) throws Exception {
		
		pgService.populateDummyData();
		pgService.testPagination();
	}

}

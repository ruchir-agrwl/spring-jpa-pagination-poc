package com.poc.paginationpoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.poc.paginationpoc.entity.Employee;
import com.poc.paginationpoc.repo.EmployeeRepo;

@Service
public class PaginationService {

	@Autowired
	EmployeeRepo empRepo;

	public void populateDummyData() {
		for (int i = 1; i <= 32; i++) {
			empRepo.save(new Employee(i, "Employee -" + i));
		}
	}

	public void testPagination() {

		Pageable pagable = PageRequest.of(0, 5);
		Page<Employee> page = empRepo.findAll(pagable);
		System.out.println("Total Number of Pages are: " + page.getTotalPages());
		
		for(int i=0;i<page.getTotalPages();i++) {
			System.out.println("Fetching request of page "+i);
			Pageable p = PageRequest.of(i, 5);
			Page<Employee> pa = empRepo.findAll(p);
			List<Employee> list = pa.getContent();
			for (Employee e : list) {
				System.out.println(e);
			}
		}

	}

}

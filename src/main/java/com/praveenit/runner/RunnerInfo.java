package com.praveenit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.praveenit.entity.Employee;
import com.praveenit.repo.EmployeeRepository;

@Repository
public class RunnerInfo implements CommandLineRunner {
long b=45;
	@Autowired
	private EmployeeRepository emprepo;
	
long a=12;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	int i=10;
int k=11;
		int j=11;

	
		Pageable pageable= PageRequest.of(2, 5);
		Page<Employee> page=emprepo.findAll(pageable);
		List<Employee> list =page.getContent();
		list.forEach(e-> System.out.println(e));
		
		System.out.println("first page ?"+page.isFirst());
		System.out.println("last page ?"+page.isLast());
		System.out.println("next page ?"+page.hasNext());
		System.out.println("before page ?"+page.hasPrevious());
		System.out.println("total oages "+page.getTotalPages());
		System.out.println("current page number"+page.getNumber());
		System.out.println("page size "+page.getSize());
		System.out.println("total rows"+page.getTotalElements());
	}
}

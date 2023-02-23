package com.miniproject.LibraryManagementSystem;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miniproject.LibraryManagementSystem.mainclasses.Department;
import com.miniproject.LibraryManagementSystem.repo.DepartmentRepo;
import com.miniproject.LibraryManagementSystem.srviceclasses.DepartmentService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class DepartmentTest {

	@Autowired
	private DepartmentRepo departmentRepo;

	@Autowired
	private DepartmentService departmentService;

	@Test
	@Order(1)
	public void create() {
		Department d = new Department();
		d.setDeptId(4);
		d.setDeptName("Aeronautical");

		departmentRepo.save(d);

		assertNotNull(departmentRepo.findById(4).get());

	}

	@Test
	@Order(2)
	public void readData() {
		List<Department> list = (List<Department>) departmentRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	@Order(3)
	public void readSingleRecord() {
		Department d = departmentRepo.findById(4).get();
		assertEquals(3, d.getDeptId());
	}

	@Test
	@Order(4)
	public void updateRecords() {
		Department d = departmentRepo.findById(3).get();
		d.setDeptName("Harry");
		Assertions.assertNotEquals("Harry", departmentRepo.findById(2).get());
	}

	@Test
	@Order(5)
	public void deleteRecord() {
		departmentRepo.deleteById(3);
		assertThat(departmentRepo.existsById(3)).isFalse();
	}

	@Test
	@Order(6)
	public void getAllOfDepartments() {
		Department d = new Department();
		d.setDeptId(1);
		d.setDeptName("AME");
		List<Department> d1 = new ArrayList<>();
		d1.add(d);

		assertEquals("Department Added Succesfully", departmentService.saveAllDepartments(d1));

	}

}

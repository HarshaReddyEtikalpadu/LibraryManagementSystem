package com.miniproject.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.LibraryManagementSystem.entity.Department;
import com.miniproject.LibraryManagementSystem.service.DepartmentService;

@RestController
@RequestMapping("/student")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	// posting list of departments
	@PostMapping("/save/all/departments")
	public List<Department> saveAllDepartments(@RequestBody List<Department> departments) throws Exception {
		return departmentService.saveAllDepartments(departments);
	}


	// Getting/Retrieving list of departments
	@GetMapping("/get/all/departments")
	public List<Department> getAllDepartments() throws Exception {
		return departmentService.getAllDepartments();
	}

	// Delete a particular department
	@DeleteMapping("/delete/department/{deptId}")
	public void deleteDepartment(@PathVariable Integer deptId) throws Exception {
		departmentService.deleteDeptById(deptId);
	}

	// Adding a department
	@PutMapping("/add/a/departmnet")
	public void addDepartment(@RequestBody Department department) throws Exception {
		departmentService.addDepartment(department);
	}

	// Modifying a Existing department

	@DeleteMapping("/delete/all/department")
	public String deleteDepartments() {
		departmentService.deleteDepts();
		return "Departments deleted succesfully";
	}


}

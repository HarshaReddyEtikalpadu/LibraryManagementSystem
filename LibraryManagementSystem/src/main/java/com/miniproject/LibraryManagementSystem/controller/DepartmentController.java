package com.miniproject.LibraryManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.LibraryManagementSystem.mainclasses.Department;
import com.miniproject.LibraryManagementSystem.srviceclasses.DepartmentService;
@RestController
@RequestMapping("/student")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/save/all/departments")
	public List<Department> saveAllDepartments(@RequestBody List<Department> departments){
		return departmentService.saveAllDepartments(departments);
	}
	
	@GetMapping("/get/all/departments")
	public ResponseEntity<List<Department>> getAllDepartments(){
		return ResponseEntity.ok(departmentService.getAllDepartments());
	}
	
	@DeleteMapping("/delete/all/department")
	public String deleteDepartments() {
		departmentService.deleteDepts();
		return "Departments deleted succesfully";
	}
	@DeleteMapping("/delete/department/{deptId}")
	public void deleteDepartment(@PathVariable Integer deptId) {
		departmentService.deleteDeptById(deptId);
	}
	

}

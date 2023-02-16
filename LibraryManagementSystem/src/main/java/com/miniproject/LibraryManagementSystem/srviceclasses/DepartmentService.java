package com.miniproject.LibraryManagementSystem.srviceclasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.LibraryManagementSystem.mainclasses.Department;
import com.miniproject.LibraryManagementSystem.repo.DepartmentRepo;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepo departmentRepo;

	public List<Department> saveAllDepartments(List<Department> departments) {
		return (List<Department>) departmentRepo.saveAll(departments);
	}
	
	public List<Department> getAllDepartments() {
		return (List<Department>) departmentRepo.findAll();
	}
	
	public void deleteDeptById(Integer deptId) {
		departmentRepo.deleteById(deptId);
		
	}
	
	public void deleteDepts() {
		departmentRepo.deleteAll(); 
	}

	public void addDepartment(Department department) {
		departmentRepo.save(department);
		}
	
	

	
	
}

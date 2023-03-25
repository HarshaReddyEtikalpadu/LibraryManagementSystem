package com.miniproject.LibraryManagementSystem.srviceclasses;

import java.util.List;
import java.util.Optional;

import com.miniproject.LibraryManagementSystem.mainclasses.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.LibraryManagementSystem.mainclasses.Department;
import com.miniproject.LibraryManagementSystem.repo.DepartmentRepo;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepo departmentRepo;

	public List<Department> saveAllDepartments(List<Department> departments) throws Exception {
		List<Department> departmentsList = (List<Department>) departmentRepo.saveAll(departments);
		if( departmentsList != null)
		{
			return departmentsList;
		}

		throw new Exception("Unable to save departments list");
	}
	
	public List<Department> getAllDepartments() throws Exception {
		List<Department> departmentsList = (List<Department>) departmentRepo.findAll();
		if( departmentsList != null)
		{
			return departmentsList;
		}
		throw new Exception("Unable to save departments list");
	}
	
	public void deleteDeptById(Integer deptId) throws Exception {
		Optional<Department> optionalDepartment = departmentRepo.findById(deptId);
		if (optionalDepartment.isPresent()) {
			departmentRepo.deleteById(deptId);
		} else {
			throw new Exception(
					"Department is not found with the id: "+deptId);
		}


		
	}
	
	public void deleteDepts() {
		departmentRepo.deleteAll(); 
	}

	public void addDepartment(Department department) throws Exception {
		Department departmentSaved =

		departmentRepo.save(department);
		if(departmentSaved == null){
			throw new Exception("Unable to save the department");
		}
		}
	
	

	
	
}

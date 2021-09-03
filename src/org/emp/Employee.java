package org.emp;

import org.client.Client;
import org.comp.Company;
import org.project.Project;

public class Employee {
public void empName() {
System.out.println("Rajesh is an employee.");
}
public static void main(String[] args) {
				Employee name = new Employee();
				name.empName();
			
				Project pname = new Project();
				pname.projectName();
				
				Client cname = new Client();
				cname.clientName();
				
				Company coname =  new Company();
				coname.companyName();


}
}

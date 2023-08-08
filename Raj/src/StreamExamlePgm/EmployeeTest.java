package StreamExamlePgm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
 
	public static void main(String args[]) {
		
		List<Employee> employee=new ArrayList<Employee>();
		
		
		
		employee.add(new Employee(33,"Male","Raj",10000));
		employee.add(new Employee(20,"Male","Raji",20000));
		employee.add(new Employee(24,"Female","Saranya",30000));
		employee.add(new Employee(26,"Female","Abi",40000));
		employee.add(new Employee(20,"Female","Yazhini",300000));
		employee.add(new Employee(24,"Male","Sidharth",400000));
		System.out.println(employee);
		
		//Find words stating with R and collect them
		employee.stream().filter(name->name.getName().startsWith("Raj")).forEach(System.out::println);
		
		//or
		List<Employee>employees =employee.stream().filter(name->name.getName().startsWith("R")).collect(Collectors.toList());
		
		 System.out.println(employees);
		 
		 //Filter employee and grouping  based on the gender
		 		 
		 Map<String,List<Employee>>result =employee.stream().collect(Collectors.groupingBy(Employee::getGender));
		 /*result.entrySet().forEach(entry->{
			System.out.println( "Grouping name : "+entry.getKey()+" : "+entry.getValue());
		 });*/
		 
		 System.out.println(result);
		 
		 // Create custom functional interface and use it in main method with lambda expression
		 
		 GlobalInterface gbl=()-> {
			 System.out.println("Welcome to Functional Interface"); 
			 };
		 
		 gbl.display();
		
		
		List<Employee> increment=employee.stream().filter(s->s.getGender().equalsIgnoreCase("female")).map(e-> 
		{
			if(e.getAge()>25)
			{
				e.setSalary(e.getSalary()*1.10);
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(increment);
				
		
		
	}

	}

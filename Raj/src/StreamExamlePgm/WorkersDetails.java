package StreamExamlePgm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class WorkersDetails {

	public static void main(String[] args) {
		List<Workers> workerList=new ArrayList<>();
		
		workerList.add(new Workers(101,"Siva",101,"inactive",21000));
		workerList.add(new Workers(102,"Raj",101,"active",25000));
		workerList.add(new Workers(103,"Mani",102,"active",24000));
		workerList.add(new Workers(104,"Saran",102,"inactive",52000));
		workerList.add(new Workers(105,"Kavi",103,"active",8000));
		workerList.add(new Workers(106,"Nila",103,"active",7000));
		workerList.add(new Workers(107,"Azhagu",104,"inactive",6000));
		workerList.add(new Workers(108,"Raj",104,"active",5000));
		
		
		//to print all names
		
		/*List<String> workname=workerList.stream().map(name->name.getEmpName())
				.distinct().collect(Collectors.toList());*/
		
		Set<String> workname=workerList.stream().map(name->name.getEmpName()).collect(Collectors.toSet());
		System.out.println(workname);
		
		
		//to print emp details based on dept
		
		Map<Integer,List<Workers>> basedOnDept=workerList.stream()
				.collect(Collectors.groupingBy(Workers::getDeptId,Collectors.toList()));
		/* basedOnDept.entrySet().forEach(entry->{
			 System.out.println(entry.getKey()+"----"+entry.getValue());
			 
			list.stream().collect(Collectors.groupingBy(Employee::getName).toString())
		.entrySet().forEach(entrySet->System.out.println(entrySet.getKey+" : "+entrySet.getValue)); 
		 });*/
		System.out.println(basedOnDept);
		
		 //to print workers count working in each department
		 
		 Map<Integer, Long> countDept=workerList.stream()
				 .collect(Collectors.groupingBy(Workers::getDeptId,Collectors.counting()));
		 
		 countDept.entrySet().forEach(entry->{
			 System.out.println("Dept "+entry.getKey()+"----"+entry.getValue());
		 });
		 
		 // to print active and inactive workers in the given collection
		 
		long activeCount= workerList.stream().filter(e->"active".equals(e.getStatus())).count();
		long inactiveCount= workerList.stream().filter(e->"inactive".equals(e.getStatus())).count();
		
		System.out.println("Active ount : "+activeCount);
		System.out.println("InActive ount : "+inactiveCount);
		
		//to print Max/Min workers salary from the given collection
		
		 Optional<Workers> maxCount=workerList.stream().max(Comparator.comparing(Workers::getSalary));
		 Optional<Workers> minCount=workerList.stream().min(Comparator.comparing(Workers::getSalary));
		 
		 DoubleSummaryStatistics totalCount=workerList.stream().collect(Collectors.summarizingDouble(Workers::getSalary));
		
		 System.out.println("Total Salary : "+totalCount);
		 System.out.println("Maximum Salary : "+maxCount);
		 System.out.println("Minimum Salary : "+minCount);
		 
		 //to print the max salary of an employee from each department
		 
		 Map<Integer,Optional<Workers>> topSalary=workerList.stream()
				 .collect(Collectors.groupingBy(Workers::getDeptId,
				 Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Workers::getSalary)))));
		 
		 topSalary.entrySet().forEach(entry-> {
			 System.out.println("Dept : "+entry.getKey()+"Top emp: "+entry.getValue());
		 });
	}

}

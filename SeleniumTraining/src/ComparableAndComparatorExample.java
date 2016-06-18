import java.util.Arrays;

public class ComparableAndComparatorExample {
	
	public static void main(String a[])
	{
		Employee employees[]= new Employee[3];
		employees[0] = new Employee(10, "arvind", 20000);
		employees[1] = new Employee(30, "vinay", 10000);
		employees[2] = new Employee(20, "sweety", 30000);
//		Arrays.sort(employees);
//		Arrays.sort(employees,Employee.empIDComparator);
		
		for(Employee employee: employees)
		{
			System.out.println(employee.getEmpId());
		}
		
		
		
	}

}

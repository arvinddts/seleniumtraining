import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private int empSalary;
	
	public Employee(int empId,String empName, int empSalary)
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public void setEmpId(int id)
	{
		this.empId = id;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpName(String name)
	{
		this.empName = name;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpSalary(int salary)
	{
		this.empSalary = salary;
	}
	
	public int getEmpSalary()
	{
		return empSalary;
	}

 	//COMPARABLE SORTING
	public int compareTo(Employee compareEmpId) {
		 
		return new Integer(this.empId).compareTo(new Integer(compareEmpId.empId));
		
	} 
	
	//COMPARATOR SORTING
	public static Comparator<Employee> empIDComparator = new Comparator<Employee>() {
		 
        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getEmpId() - e2.getEmpId());
        }
    };
	

}

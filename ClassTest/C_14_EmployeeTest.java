package ClassTest;

public class C_14_EmployeeTest {
	public static void main(String args[]) {
		C_14_Employee e1,e2,e3;
		e1 = new C_14_Employee("김철수",35000);
		e2 = new C_14_Employee("최수철",50000);
		e3 = new C_14_Employee("김철호",20000);
		
		int n = C_14_Employee.getCount();
		System.out.println("현재의 직원 수는 = " + n);
		e3.finalize();
		n = C_14_Employee.getCount();
		System.out.println("현재의 직원 수는 = " + n);
	}

}

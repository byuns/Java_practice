package ClassTest;

public class C_14_EmployeeTest {
	public static void main(String args[]) {
		C_14_Employee e1,e2,e3;
		e1 = new C_14_Employee("��ö��",35000);
		e2 = new C_14_Employee("�ּ�ö",50000);
		e3 = new C_14_Employee("��öȣ",20000);
		
		int n = C_14_Employee.getCount();
		System.out.println("������ ���� ���� = " + n);
		e3.finalize();
		n = C_14_Employee.getCount();
		System.out.println("������ ���� ���� = " + n);
	}

}

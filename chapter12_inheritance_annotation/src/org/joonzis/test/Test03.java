package org.joonzis.test;

class Employee{
	String name, dept;

	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
	}
}

class SalaryWorker extends Employee{
	int salary;

	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}
	
	int pay() {
		return salary;
	}

	@Override
	void output() {
		super.output();
		System.out.println("월급 : " + pay());
	}
}

class PartTimeWorker extends Employee{
	int workTime, payPerHour;

	public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name, dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	
	int pay() {
		return workTime * payPerHour;
	}

	@Override
	void output() {
		super.output();
		System.out.println("근무시간 : " + workTime);
		System.out.println("시급 : " + payPerHour);
		System.out.println("급여 : " + pay());
	}
}

class SalesWorker extends SalaryWorker{
	double salesIncentive;
	

	public SalesWorker(String name, String dept, int salary, double salesIncentive) {
		super(name, dept, salary);
		this.salesIncentive = salesIncentive;
	}

	int salesPay() {
		int salesPay = (int)(salary * salesIncentive);
		return salesPay;
	}
	
	@Override
	int pay() {
		return super.pay() + salesPay();
	}

	@Override
	void output() {
		super.output();
		System.out.println("수당 : " + salesPay());
	}
}

public class Test03 {

	public static void main(String[] args) {
		SalaryWorker salaryworker = new SalaryWorker("김", "SI개발", 3000000);
		salaryworker.output();
		
		System.out.println("----------------------");
		
		SalesWorker salesworker = new SalesWorker("박", "영업부", 4000000, 0.2);
		salesworker.output();

		System.out.println("----------------------");
		
		PartTimeWorker parttimeworker = new PartTimeWorker("이", "경리부", 10, 13000);
		parttimeworker.output();
	}
}
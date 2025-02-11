package org.joonzis.test;

class Employee{
	private String name,dept;

	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	int pay() {
		return 0;
	}
	
	void output() {
		System.out.print("이름 : " + name + ", " + "부서 : " + dept + " ");
	}
}

class SalaryWorker extends Employee{
	private int salary;

	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}
	
	@Override
	int pay() {
		return salary;
	}
	
	void output() {
		super.output();
		System.out.println("월급 : " + salary + "만원");
	}
}

class SalesWorker extends SalaryWorker{
	private int salesVolume;
	private double salesIncentive;
	
	public SalesWorker(String name, String dept, int salary, int salesVolume) {
		super(name, dept, salary);
		this.salesVolume = salesVolume;
		setSalesIncentive();
	}
	
	private void setSalesIncentive() {
		if (salesVolume >= 1000) {
            this.salesIncentive = 0.1;
        } else if (salesVolume >= 500) {
            this.salesIncentive = 0.05;
        } else {
            this.salesIncentive = 0.01;
        }
	}
	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		setSalesIncentive();  // 판매량 변경 시 인센티브 비율 재설정
	}
	
	@Override
	public int pay() {
		return super.pay() + salesPay();
	}
	
	public int salesPay() {
		return (int)(salesVolume * salesIncentive);
	}
	
	@Override
	public void output() {
		super.output();
        System.out.println("판매량: " + salesVolume + ", 인센티브 비율: " + (salesIncentive * 100) + "%");
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
	}
}

public class Test01 {
    public static void main(String[] args) {
        // 다형성을 활용하여 Employee 타입의 배열을 선언
        Employee[] workers = new Employee[3];

        workers[0] = new SalaryWorker("이영희", "기획부", 300);  // 월급직원
        workers[1] = new SalesWorker("박지민", "영업부", 250, 1000);  // 판매직원
        workers[2] = new PartTimeWorker("최지우", "청소부", 80, 15000);  // 시간제 근로자

        // 배열에 저장된 각 객체의 정보 출력 및 급여 계산
        for (Employee worker : workers) {
            worker.output();  // 다형성: 실제 객체에 맞는 output() 호출
            System.out.println("급여: " + worker.pay() + "원");
            System.out.println();
        }
    }
}

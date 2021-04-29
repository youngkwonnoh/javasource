package ch8;

public class EmployeeEx2 {
	public static void main(String[] args) {
		
		Worker worker = new Worker();
		
		
		Employee employee = new Employee();
		employee.setName("홍길동");
		employee.setPosition("사원");
		worker.work(employee); // Employee employee = employee;
		
		// Employee ceo = new Ceo();
		Ceo ceo = new Ceo();
		ceo.setName("김동호");
		ceo.setPosition("사장");
		worker.work(ceo); // Employee employee = ceo;
		
		// Employee admin = new Admin();
		Admin admin = new Admin();
		admin.setName("맹구");
		admin.setPosition("관리자");
		worker.work(admin); // Employee employee = admin;
		

		// Employee part = new PartTime();
		PartTime part = new PartTime();
		part.setName("짱구");
		part.setPosition("시간제");
		worker.work(part); // Employee employee = part;
		
		
		
		
	}
	
	public static void work(Employee employee) {
		employee.work();
		
		
		
	}
}

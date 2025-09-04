package entities;

public class Employee {

	public String name;
	public double salary;
	public double tax;

	public double netSalary() {
		return salary - tax;
	}

	public void increaseSalary(double porcentage) {
		salary += salary * porcentage / 100;
	}

	public String toString() {
		return "Updated data: " + name + ", $ " + String.format("%.2f", salary);

	}

}

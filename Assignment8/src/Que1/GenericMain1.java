package Que1;


class Box<T extends Employee>{
	private T box;

	public T getBox() {
		return box;
	}
	public void setBox(T box) {
		this.box = box;
	}
	public int getEsalary() {
		return box.totalSalary();	
	}
	
}
public class GenericMain1 <T extends Employee> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.accept();
		Box <Employee> b1 = new Box<>();
		b1.setBox(e);
		b1.getBox().totalSalary();
		
		Manager m = new Manager();
		m.accept();
		Box<Manager> b2 = new Box<>();
		b2.setBox(m);
		b2.getBox().totalSalary();
	}

}

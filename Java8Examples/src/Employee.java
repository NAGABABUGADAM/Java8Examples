
public class Employee implements Cloneable {

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public Employee(int n, String name) {

		this.id = n;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private int id;
	private String name;

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}

}

package corejava.basic;

class Person {
	private int age;
	private String name;
	private String address;

	public Person() {
		this.age = 45;
		this.name = "Ram";
		this.address = "Kalyan";
	}

	public Person(int age, String name, String address) {

		this.age = age;
		this.name = name;
		this.address = address;
	}

	public Person(String address, String name) {

		this.age = 31;
		this.name = name;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

}

public class Consrtuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		System.out.println(p1);
		p1.setAddress("Mumbai");
		p1.setName("Aaran");
		p1.setAge(28);
		System.out.println(p1);
		Person p2 = new Person(35, "Marshal", "thane");
		System.out.println(p2);
		Person p3 = new Person("Pune", "Sunil");
		System.out.println(p3);
	}

}

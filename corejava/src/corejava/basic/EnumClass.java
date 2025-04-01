package corejava.basic;

enum Status {
	Running, Stopped, Terminated, Starting
}

enum Laptops {
	Mac(200000), Predator(120000), Rog(150000), Alienware(250000);

	private int price;

	Laptops(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class EnumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status s = Status.Running;
		String x = Status.Terminated.toString();

		System.out.println(s + "   " + x);

		Status[] ss = Status.values();

		for (Status a : ss) {

			System.out.println(a + " : " + a.ordinal());

		}

		System.out.println("**********************************************");

		Laptops[] ll = Laptops.values();

		System.out.println(
				Laptops.Alienware.ordinal() + " : " + Laptops.Alienware + " : " + Laptops.Alienware.getPrice());
		for (Laptops l : ll) {
			System.out.println(l.ordinal() + " : " + l + " : " + l.getPrice());
		}

	}

}

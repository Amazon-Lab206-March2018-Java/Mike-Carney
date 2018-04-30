
public class PhoneTest {
	public static void main(String[] args) {
		Galaxy s8 = new Galaxy ("S8", 100, "Verizon", "*ANGRY NOISES!!!");
		IPhone x = new IPhone("x", 100, "AT&T", "Boop!");
		s8.displayInfo();
		System.out.println(s8.ring());
		System.out.println(s8.unlock());
		x.displayInfo();
		System.out.println(x.ring());
		System.out.println(x.unlock());
	}
}



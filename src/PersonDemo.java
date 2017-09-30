
public class PersonDemo {

	public static void main(String[] args) {

		Person person = new Person();
		person.setFirstName("Tim");
		person.setLastName("Tom");
		person.setId(123);
		person.toString();
		// default prints as getClass().getName() + "@" + Integer.toHexString(hashCode())
		System.out.println(person);
		System.out.println(person.hashCode());
		
		
		Person person2 = new Person();
		person2.setFirstName("Tim");
		person2.setLastName("Tom");
		person2.setId(123);
		System.out.println(person2);
		System.out.println(person2.hashCode());
		
		System.out.println(person.equals(person2));
		
	}

}

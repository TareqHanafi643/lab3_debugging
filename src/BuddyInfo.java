
public class BuddyInfo {
	private int age;
	private String name;
	public BuddyInfo() {
	}
	
	public BuddyInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo tareq = new BuddyInfo();
		tareq.setAge(19);
		tareq.setName("Tareq");
		System.out.println("Hello world! My name is " + tareq.getName() +
				" and i'm " + tareq.getAge());
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


}

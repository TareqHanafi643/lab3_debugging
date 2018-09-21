import java.util.ArrayList;


public class AddressBook {
	
	ArrayList<BuddyInfo> coll = new ArrayList<>();
	
	public void addBuddy(BuddyInfo a) {
		if(a != null) 
		coll.add(a);
	}
	
	public void removeBuddy(int index) {
		if(index >= 0 && index < coll.size())
		coll.remove(null);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Address Book");
		BuddyInfo buddy =  new BuddyInfo("tareq", 19);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
		System.out.println("wow");
	}
}

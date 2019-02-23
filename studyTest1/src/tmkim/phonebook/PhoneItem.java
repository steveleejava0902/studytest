package tmkim.phonebook;

public class PhoneItem {
	
	private String name;
	private String teleNum;
	
	public PhoneItem() {
		
	}
	
	public PhoneItem(String name, String teleNum) {
		this.name = name;
		this.teleNum = teleNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeleNum() {
		return teleNum;
	}
	public void setTeleNum(String teleNum) {
		this.teleNum = teleNum;
	}
	
	@Override
	public String toString() {
		return "PhoneItem [name=" + name + ", teleNum=" + teleNum + "]";
	}
}

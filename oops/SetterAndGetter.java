package oops;

class Account {
	public String name;
	protected String email;
	private String password;

//	getters & Setters
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}
}

public class SetterAndGetter {
	public static void main(String args[]) {
		Account account1 = new Account();
		account1.name = "Abhishek";
		account1.email = "abhishek@gmail.com";
		account1.setPassword("abcd");
		System.out.println(account1.getPassword());
	}
}

package MethodReference;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
	
		IUser iuser=User :: new;
		User user=iuser.getUser("Java8");
		System.out.println(user.getName());

	}

}

interface IUser{
	User getUser(String name);
}
class User{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	
}

package practice.Seleniumday2;

public class Mobile {
	// day 2
	public static void main(String[] args) {
		System.out.println("My new Mobile");
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMessage();
	}
	public void makeCall() {
		System.out.println("Method for making a call");
	}
	public void sendMessage() {
		System.out.println("Method for sending a message");
	}
}

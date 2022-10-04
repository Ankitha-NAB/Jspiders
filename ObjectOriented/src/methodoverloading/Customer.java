package methodoverloading;

class WhatsApp1{
	void sendMessage() {
		System.out.println("Single tick supported");
	}
}

class WhatsApp2 extends WhatsApp1{
	@Override
	void sendMessage() {
		super.sendMessage();
		System.out.println("Double tick is supported");
	}
	void story() {
		System.out.println("Image story only supported");
	}
}

class WhatsApp3 extends WhatsApp2{
	@Override
	void sendMessage() {
		super.sendMessage();
		System.out.println("Blue tick is supported");
	}
	@Override
	void story() {
		super.story();
		System.out.println("Image and video supported");
	}
	void call() {
		System.out.println("voice call is supported");
	}
}

public class Customer {

	public static void main(String[] args) {
		WhatsApp3 w3=new WhatsApp3();
		w3.sendMessage();
		w3.story();
		w3.call();

	}

}

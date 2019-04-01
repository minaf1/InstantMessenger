import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args) {
		Client client = new Client("192.168.1.21");
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client.startRunning();
	}
}

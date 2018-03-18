import java.io.IOException;


public class OpenApps {

	public static void main(String[] args) {
		OpenApps apps = new OpenApps();
		String command = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome";
		apps.openApp(command);
	}
	
	void openApp(String command) {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

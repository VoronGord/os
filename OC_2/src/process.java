
import java.util.ArrayList;

public class process {

	private ArrayList<Thread> threads;

	private String name;

	public process() {
		int k = (int) (Math.random() * 4) + 1;
		threads = new ArrayList<Thread>();
		for (int i = 0; i < k; i++) {
			int n = i + 1;
			threads.add(new Thread(n));
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public ArrayList<Thread> getThreads() {
		return threads;
	}

	public void setThreads(ArrayList<Thread> thread) {
		threads = thread;
	}
}

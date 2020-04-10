
import java.util.ArrayList;

public class process {

	private ArrayList<Thread> threads;

	private String name;
	
	private int priority;

	public process() {
		int k = (int) (Math.random() * 4) + 1;
		threads = new ArrayList<Thread>();
		priority = (int) (Math.random() * 5) + 1;
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
	
	public int getPriority() {
		return priority;
	}
}

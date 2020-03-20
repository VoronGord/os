
import java.util.ArrayList;



public class user {
	public static void main(String[] args) {
		ArrayList<process> process = new ArrayList<process>();
		int k = (int) (Math.random() * 4) + 1;
		for (int i = 0; i < k; i++) {
			process.add(new process());
			int n = i + 1;
			process.get(i).setName(n + "");
		}
		Planner scheduler = new Planner(process);
		System.out.println(scheduler.makePlan());
	}
}

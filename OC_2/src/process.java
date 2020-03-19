import java.util.ArrayList;

public class process {
	private ArrayList Process = new ArrayList();;
	private stream stream = new stream();
	private int num = 0;
	public static int status [] = new int[10];
	
	public void CreateProcess (int num) {
		this.num = num;
		for (int i=0; i<num; i++) {
			System.out.println("Процесс: " + i);
			Process.add(stream.CreateStream(i, (int)(Math.random()*5) +1));
			System.out.println(Process.get(i));
		}
		System.out.println("Потоки созданы");
	}
	
	public void CheckProcess () {
		while (status[0] != 4 || status[1] != 4) {
			for (int i = 0; i<num; i++) {
				System.out.println("Процесс: " + i);
				Process.set(i, stream.ImplStream (i));
				System.out.println(Process.get(i));			
			}			
		}
	}

}

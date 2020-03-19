
public class user {
	private static process process = new process();
	public static final int alltime = 20;
	
	public static void main (String[] args) {
		
		System.out.println("Запускаем программу");
		System.out.println("Отведено времени на выполнение процесса: " + alltime + "мс");
		process.CreateProcess((int)(Math.random()*5) +1);
		process.CheckProcess();
	}

}

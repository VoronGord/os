
public class user {
	private static process process = new process();
	public static final int alltime = 20;
	
	public static void main (String[] args) {
		
		System.out.println("��������� ���������");
		System.out.println("�������� ������� �� ���������� ��������: " + alltime + "��");
		process.CreateProcess((int)(Math.random()*5) +1);
		process.CheckProcess();
	}

}

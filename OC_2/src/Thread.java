


public class Thread {
	final int time;

	private int ostTime;

	private int name;

	public Thread(int name) {
		this.name = name;
		time = (int) (Math.random() * 10) + 5;
		ostTime = time;
	}

	public int getName() {
		return name;
	}

	public int getTime() {
		return time;
	}

	public int getOstTime() {
		return ostTime;
	}

	public void setOstTime(int time) {
		ostTime = time;
	}

}



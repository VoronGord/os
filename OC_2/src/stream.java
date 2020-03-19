import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Random;

public class stream {
	private ArrayList Stream;
	private int tfs [][] = new int [100][100];

	public ArrayList CreateStream (int j, int num) {
		Stream = new ArrayList();
		int numstr = 0;
		String status = "";
		for (int i=0; i<=num; i++) {
			Random r = new Random();
			numstr = i+1;
			tfs [i][j] = r.nextInt(40);		
			status = "В очереди";				
			Stream.add(InfoAboutStream(numstr, tfs [i][j], status));		
		}
		return Stream;
	}


	public ArrayList ImplStream (int j) {
		if (process.status[j] != 4) {
			process.status[j] = 0;	
			for (int i = 0; i<4; i++) {
				if (tfs[i][j] >= user.alltime/4) {
					tfs [i][j] = tfs[i][j] - user.alltime/4;
				} else { 
					tfs [i][j] = 0;
				}
				if (tfs [i][j] > 0) {	
					Stream.set(i, InfoAboutStream(i+1, tfs[i][j], "Не завершён"));				
				} else {
					Stream.set(i, InfoAboutStream(i+1, tfs[i][j], "Завершён"));
					process.status[j]++;
				}
			}
		} else {
			for (int i = 0; i<4; i++) {
				Stream.set(i, InfoAboutStream(i+1, tfs[i][j], "Завершён"));
			}
		}

		return Stream;
	}



	public String InfoAboutStream (int id, int time, String status) {		
		return MessageFormat.format("\n Поток id: {0}  Состояние: {2} \n  Время  до завершения: {1} ", id, time, status);
	}

}

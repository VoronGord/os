

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Planner {
	public static final int QUANT = 10;
	private ArrayList<process> process;

	public Planner(ArrayList<process> proc) {
		process = proc;
	}

	public String makePlan() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
	
	
		
		while (process.size() > 0) {
			sb.append(
					"Процесс №" + process.get(i).getName() + " , Приоритет " + process.get(i).getPriority() + ", Потоков " + process.get(i).getThreads().size() +  "\n");
			sb.append(makePlanThreads(process.get(i).getThreads(), QUANT * (process.get(i).getPriority() /2)));
			if (process.get(i).getThreads().size() > 0) {
				sb.append("Oсталось потоков " + process.get(i).getThreads().size() + "\n");
				i++;
			} else {
				sb.append("Процесс завершен\n");
				process.remove(i);
			}
			if (i >= process.size()) {
				i = 0;
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	private String makePlanThreads(ArrayList<Thread> threads, int quant) {
		StringBuilder sb = new StringBuilder();
		
	
					
		for (int i = 0; i < threads.size(); i++) {
			
			while ((threads.get(i).getOstTime() > 0) && (quant > 0)) {
				Thread j =  threads.get(i);
				sb.append("Поток №" + j.getName() + ", в процессе, " + "осталось времени "
						+ j.getOstTime()  + "\n");
				j.setOstTime(j.getOstTime() - 1);
				quant--;
				if (quant == 0 && j.getOstTime() != 0) {
					sb.append("Поток №" + j.getName() + ", Остановлен, осталось времени "
							+ j.getOstTime()  + "\n");

					break;
				}
				if (j.getOstTime() == 0) {
					sb.append("Поток №" + j.getName() + ", Завершен, осталось времени "
							+ j.getOstTime()  + "\n");
					threads.remove(i);
					--i;
					break;
				}
			}
		}
			
		return sb.toString();
	}	
}

 

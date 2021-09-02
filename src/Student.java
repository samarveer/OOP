import java.util.Scanner;

public class Student {
	
	private String name;
	private int score;
	private int count;

	Scanner in = new Scanner(System.in);
	
	public Student(String name, int score) {
		
		name = in.next();
		score = in.nextInt();
		
		this.name = name;
		this.score = score;
		this.count = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = in.next();
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = in.nextInt();
	}
	
}


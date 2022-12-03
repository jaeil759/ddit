package e_oop.student;

public class StudentScore {
	private int oracle, javaBasic, webbasic, javaHigh, jsp, spring, python;
	private String name;
	private int sum;
	private double avg;
	private int rank;
	
	private StudentScore() {}

	public StudentScore(int oracle, int javaBasic, int webbasic, int javaHigh, int jsp, int spring, int python,
			String name) {
		this.oracle = oracle;
		this.javaBasic = javaBasic;
		this.webbasic = webbasic;
		this.javaHigh = javaHigh;
		this.jsp = jsp;
		this.spring = spring;
		this.python = python;
		this.name = name;
		this.sum = oracle + javaBasic + webbasic + javaHigh + jsp + spring + python;
		this.avg = sum / 7.0;
		this.rank = 1;
	}
	public int[] getSubjectsScore() {
		int[] result = new int[7];
		result[0] = this.oracle;
		result[1] = this.javaBasic;
		result[2] = this.webbasic;
		result[3] = this.javaHigh;
		result[4] = this.jsp;
		result[5] = this.spring;
		result[6] = this.python;
		return result;
	}
	public int getOracle() {
		return oracle;
	}

	public int getJavaBasic() {
		return javaBasic;
	}

	public int getWebbasic() {
		return webbasic;
	}

	public int getJavaHigh() {
		return javaHigh;
	}

	public int getJsp() {
		return jsp;
	}

	public int getSpring() {
		return spring;
	}

	public int getPython() {
		return python;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSum() {
		return sum;
	}
	@Override
	public String toString() {
		return String.format("%5s%5d%5d%5d%5d%5d%5d%5d%5d\t%.2f\t%d", name, oracle, javaBasic, webbasic, javaHigh, jsp, spring, python, sum, avg, rank);
		
	}
}

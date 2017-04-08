
public class StateStats {
	private String state;
	private int fa;
	private int a;
	private int ga;
	private int b;
	private int c;
	private int start;
	private int stub;

	public StateStats (String state, int fa, int a, int ga, int b, int c, int start, int stub) {
		this.state = state;
		this.fa=fa;
		this.a=a;
		this.ga=ga;
		this.b=b;
		this.c=c;
		this.start=start;
		this.stub=stub;
	}
	
	public String GetBest() {
		if (fa > 0)
			return "FA";
		if (a > 0)
			return "A";
		if (ga > 0)
			return "GA";
		if (b > 0)
			return "B";
		if (c > 0)
			return "C";
		if (start > 0)
			return "Start";
		if (stub > 0)
			return "Stub";
		return "List";
	
	}
	public String toString() {
		return state + ": " + fa + " " + a + " " + ga + " " + b + " " + c + " " + start + " " + stub;
	
	}
}

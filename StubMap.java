
public class StubMap extends MapFile {
	public StubMap() {
		filename="Map_of_USRD_stubs_template.svg";
		outputname="Map_of_USRD_stubs.svg";
	}
	
	public String getStatistic(StateStats state) {
		int stubs = state.getStubs();
		if (stubs == 0)
			return "s000";
		if (stubs <= 25)
			return "s025";
		if (stubs <= 50)
			return "s050";
		if (stubs <= 75)
			return "s075";
		if (stubs <= 100)
			return "s100";
		return "s999";
		
	}
}

public class WwMap extends MapFile {
	public WwMap() {
		filename="Map_of_USRD_rel_WW_template.svg";
		outputname="Map_of_USRD_rel_WW.svg";
	}
	
	public String getStatistic(StateStats state) {
		double ww = state.getWikiWork();
		int temp = (int) Math.floor(ww);
		double temp2 = (ww-temp) * 10;
		int temp3 = (int) Math.floor(temp2);
		return "ww" + temp + temp3;
		
	}
}

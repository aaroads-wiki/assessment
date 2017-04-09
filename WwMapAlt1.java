public class WwMapAlt1 extends MapFile {
	public WwMapAlt1() {
		filename="Map_of_USRD_rel_WW_alt_1_template.svg";
		outputname="Map_of_USRD_rel_WW_alt_1.svg";
	}
	
	public String getStatistic(StateStats state) {
		double ww = state.getWikiWork();
		
		if (ww < 1.000)
			return "under";
		if (ww > 2.040)
			return "over";
		if (ww >= 2.000)
			return "ww100";
		
		int temp = (int) Math.floor(ww);
		double temp2 = (ww-temp) * 100;
		int temp3 = (int) Math.floor(temp2);
		temp3 = (temp3 / 4) * 4;
		String temp3String = Integer.toString(temp3);
		while (temp3String.length() < 2)
			temp3String = "0" + temp3String;
		return "ww" + temp3String;
		
	}
}

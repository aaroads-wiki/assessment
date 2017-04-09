public class WwMapAlt extends MapFile {
	public WwMapAlt() {
		filename="Map_of_USRD_rel_WW_alt_template.svg";
		outputname="Map_of_USRD_rel_WW_alt.svg";
	}
	
	public String getStatistic(StateStats state) {
		double ww = state.getWikiWork();
		
		if (ww < 5.000)
			return "under";
		
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

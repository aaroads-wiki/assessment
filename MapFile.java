import java.util.ArrayList;
import java.io.*;


public abstract class MapFile {
	protected String filename;
	protected String outputname;
	public void Generate(ArrayList<StateStats> input) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			BufferedWriter writer = new BufferedWriter(new FileWriter("output/" + outputname));
			String line;
			while ((line = reader.readLine()) != null){
				if (line.contains("path id=")) {
					String temp = line.substring(line.indexOf("id=")+4, line.indexOf("id=")+6);
					if (temp != null) {
						for (int j = 0; j < input.size(); j++) {
							StateStats state = input.get(j);
							if (state.getAbbreviation().equals(temp)) {
								line = line.replace("XXXX", getStatistic(state));
								
							}
						}
					}
				}
				writer.write(line + "\n");
			}
			reader.close();
			writer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public abstract String getStatistic(StateStats state);
	
}

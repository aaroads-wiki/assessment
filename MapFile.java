import java.util.ArrayList;
import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public abstract class MapFile {
	protected String filename;
	public void Generate(ArrayList<StateStats> input) {
		try {
			Document doc = ImportFile();
		}
		catch (Exception e) {
			System.err.println("error: " + e.getMessage());
		}
	}
	
	public Document ImportFile() throws Exception {
		File fXmlFile = new File(filename);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		return doc;
	}
}

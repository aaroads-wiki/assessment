import java.net.*;
import java.io.*;

public class Api {

	private String apiListCall (String action, String list, String args) throws IOException{
		BufferedReader result = null;
		URL urlObject = new URL("https://en.wikipedia.org/w/api.php?action=" + action + "&list=" + list + args + "&format=xml&rawcontinue=yes");
		HttpURLConnection connection = (HttpURLConnection) urlObject.openConnection();
		InputStream in = connection.getInputStream();
		result = new BufferedReader(new InputStreamReader(in));
		String line;
		while ((line = result.readLine()) != null) {
			System.out.println(line);
		}
		
		return line;
	}
	
	protected String query (String list, String args) throws IOException{
		return apiListCall("query", list, args);
	}
}
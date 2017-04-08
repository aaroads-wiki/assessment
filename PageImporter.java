import java.net.URLEncoder;

public class PageImporter {
	public void Run(String project) {
		try {
			CategoryMembers api = new CategoryMembers ();
			api.categoryMembers(URLEncoder.encode(project));
		}
		catch (Exception e) {
			System.err.println("Exception thrown:" + e.getMessage() + e.getStackTrace());
		}
	}
}
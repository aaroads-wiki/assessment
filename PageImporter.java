import java.net.URLEncoder;

public class PageImporter {
	public StateStats Run(String project) {
		try {
			CategoryMembers api = new CategoryMembers ();
			int fa = api.categoryMembers(URLEncoder.encode("FA-Class " +project+" road transport articles", "UTF-8"));
			int a = api.categoryMembers(URLEncoder.encode("A-Class " +project+" road transport articles", "UTF-8"));
			int ga = api.categoryMembers(URLEncoder.encode("GA-Class " +project+" road transport articles", "UTF-8"));
			int b = api.categoryMembers(URLEncoder.encode("B-Class " +project+" road transport articles", "UTF-8"));
			int c = api.categoryMembers(URLEncoder.encode("C-Class " +project+" road transport articles", "UTF-8"));
			int start = api.categoryMembers(URLEncoder.encode("Start-Class " +project+" road transport articles", "UTF-8"));
			int stub = api.categoryMembers(URLEncoder.encode("Stub-Class " +project+" road transport articles", "UTF-8"));
			StateStats stats = new StateStats(project, fa, a, ga, b, c, start, stub);
			System.err.println(stats);
			return stats;
		}
		catch (Exception e) {
			System.err.println("Exception thrown:" + e.getMessage() + e.getStackTrace());
			return null;
		}
	}
}
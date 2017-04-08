import java.io.*;

public class CategoryMembers extends Api {
	public void categoryMembers(String category) throws IOException{
		query("categorymembers", "&cmtitle=Category:" + category + "&cmlimit=max");
	}
}
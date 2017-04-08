import java.util.ArrayList;

public class MapGenerator {
	public static void main (String[] args) {
		StateImporter importer = new StateImporter();
		ArrayList<StateStats> results = importer.Run();
		

		BestArticle bestArticle = new BestArticle();
		bestArticle.Generate(results);
	}
}
import java.util.ArrayList;

public class MapGenerator {
	public static void main (String[] args) {
		StateImporter importer = new StateImporter();
		ArrayList<StateStats> results = importer.Run();
		

		BestArticle bestArticle = new BestArticle();
		bestArticle.Generate(results);
		StubMap stubMap = new StubMap();
		stubMap.Generate(results);
		WwMap wwMap = new WwMap();
		wwMap.Generate(results);
		WwMapAlt wwMapAlt = new WwMapAlt();
		wwMapAlt.Generate(results);
		WwMapAlt4 wwMapAlt4 = new WwMapAlt4();
		wwMapAlt4.Generate(results);
		
		WwMapAlt3 wwMapAlt3 = new WwMapAlt3();
		wwMapAlt3.Generate(results);
		
		WwMapAlt2 wwMapAlt2 = new WwMapAlt2();
		wwMapAlt2.Generate(results);
		
		WwMapAlt1 wwMapAlt1 = new WwMapAlt1();
		wwMapAlt1.Generate(results);
	}
}
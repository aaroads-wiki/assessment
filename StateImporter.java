import java.util.ArrayList;

public class StateImporter {
	public ArrayList<StateStats> Run() {
		ArrayList<StateStats> states = new ArrayList<StateStats>();
		PageImporter importer = new PageImporter();
		states.add(importer.Run("Alabama"));
		states.add(importer.Run("Alaska"));
		states.add(importer.Run("Arizona"));
		states.add(importer.Run("Arkansas"));
		states.add(importer.Run("California"));
		states.add(importer.Run("Colorado"));
		states.add(importer.Run("Connecticut"));
		states.add(importer.Run("Delaware"));
		states.add(importer.Run("District of Columbia"));
		states.add(importer.Run("Florida"));
		states.add(importer.Run("Georgia"));
		states.add(importer.Run("Guam"));
		states.add(importer.Run("Hawaii"));
		states.add(importer.Run("Idaho"));
		states.add(importer.Run("Illinois"));
		states.add(importer.Run("Indiana"));
		states.add(importer.Run("Iowa"));
		states.add(importer.Run("Kansas"));
		states.add(importer.Run("Kentucky"));
		states.add(importer.Run("Louisiana"));
		states.add(importer.Run("Maine"));
		states.add(importer.Run("Maryland"));
		states.add(importer.Run("Massachusetts"));
		states.add(importer.Run("Michigan"));
		states.add(importer.Run("Minnesota"));
		states.add(importer.Run("Mississippi"));
		states.add(importer.Run("Missouri"));
		states.add(importer.Run("Montana"));
		states.add(importer.Run("Nebraska"));
		states.add(importer.Run("Nevada"));
		states.add(importer.Run("New Hampshire"));
		states.add(importer.Run("New Jersey"));
		states.add(importer.Run("New Mexico"));
		states.add(importer.Run("New York"));
		states.add(importer.Run("North Carolina"));
		states.add(importer.Run("North Dakota"));
		states.add(importer.Run("Ohio"));
		states.add(importer.Run("Oklahoma"));
		states.add(importer.Run("Oregon"));
		states.add(importer.Run("Pennsylvania"));
		states.add(importer.Run("Puerto Rico"));
		states.add(importer.Run("Rhode Island"));
		states.add(importer.Run("South Carolina"));
		states.add(importer.Run("South Dakota"));
		states.add(importer.Run("Tennessee"));
		states.add(importer.Run("Texas"));
		states.add(importer.Run("U.S. Virgin Islands"));
		states.add(importer.Run("Utah"));
		states.add(importer.Run("Vermont"));
		states.add(importer.Run("Virginia"));
		states.add(importer.Run("Washington"));
		states.add(importer.Run("West Virginia"));
		states.add(importer.Run("Wisconsin"));
		states.add(importer.Run("Wyoming"));
		
		return states;
	}
}

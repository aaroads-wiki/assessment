import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;
import org.xml.sax.InputSource;

public class CategoryMembers extends Api {
	public int categoryMembers(String category) throws IOException{
		String results = query("categorymembers", "&cmtitle=Category:" + category + "&cmlimit=max");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
	    DocumentBuilder builder;  
	    try  
	    {  
	        builder = factory.newDocumentBuilder();  
	        Document document = builder.parse( new InputSource( new StringReader( results ) ) );  
	        Element root = document.getDocumentElement();
	        NodeList nList = root.getElementsByTagName("cm");
	        return nList.getLength();
	        
	    } catch (Exception e) {  
	        e.printStackTrace();  
	        return 0;
	    } 
	}
}
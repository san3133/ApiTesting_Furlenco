package Utils;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xml_read {

	
	 public String readXML(String searchelement,String tag) throws SAXException, IOException, ParserConfigurationException{
         String ele = null;
         File fXmlFile = new File("C:\\Users\\NadirI.INTERNAL\\workspace\\GXS\\src\\properties\\TestData.xml");
         
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(fXmlFile);

         doc.getDocumentElement().normalize();

         NodeList nList = doc.getElementsByTagName(searchelement);


         Node nNode = nList.item(0);

         if (nNode.getNodeType() == Node.ELEMENT_NODE) {
             Element eElement = (Element) nNode;
              ele=eElement.getElementsByTagName(tag).item(0).getTextContent();

         }
         return ele;
     }
	
}

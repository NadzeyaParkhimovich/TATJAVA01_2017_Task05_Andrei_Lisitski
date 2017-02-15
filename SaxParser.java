import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParser extends DefaultHandler {

	private List<Food> foodList = new ArrayList<>();
	private Food food;
	private StringBuilder text;

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}

	public void startDocument() throws SAXException {
		System.out.println("Parsing started");
	}

	public void endDocument() throws SAXException {
		System.out.println("Parsing ended");
	}

	public void startElement(String url, String localName, String qName,
			Attributes attributes) throws SAXException {

		System.out.println("Start element: " + "Url: " + url + ", localName: "
				+ localName + ", qName: " + qName);

		text = new StringBuilder();
		if (qName.equals(food)) {
			food = new Food();
			food.setId(Integer.parseInt(attributes.getValue("id")));
		}
	}

	public void endElement(String url, String localName, String qName)
			throws SAXException {
		MenuTagName tagName = MenuTagName.valueOf(qName.toUpperCase());
		
		switch (tagName) {
		
		case NAME:
			food.setName(text.toString());
			break;
		case CONSIST:
			food.setConsist(text.toString());
			break;
		case WEIGHT:
			food.setConsist(text.toString());
			break;
		case RRICE:
			food.setPrice(Integer.parseInt(text.toString()));
			break;
		}

	}

}

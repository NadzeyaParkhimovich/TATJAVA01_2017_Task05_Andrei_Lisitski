package com.epam.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import com.epam.bean.Food;
import com.epam.bean.MenuTagName;

public class MenuSaxHandler extends DefaultHandler {

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
		MenuTagName tagName = MenuTagName.valueOf(qName.toUpperCase().replace("-", "_"));

		switch (tagName) {
		
		case CATEGORY:
			food.setCategory(text.toString());
			break;
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
		case DISH:
			foodList.add(food);
			food = null;
			break;
		}
	}

	public void warning(SAXParseException exception) {
		System.err.println("WARNING: line " + exception.getLineNumber() + ": "
				+ exception.getMessage());
	}

	public void error(SAXParseException exception) {
		System.err.println("ERROR: line " + exception.getLineNumber() + ": "
				+ exception.getMessage());
	}

	public void fatalError(SAXParseException exception) throws SAXException {
		System.err.println("FATAL: line " + exception.getLineNumber() + ": "
				+ exception.getMessage());
		throw (exception);
	}

}

package com.codecool.app;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLCardDao implements CardDao {
    private List<Card> cards = new ArrayList<>();

    @Override
    public List<Card> getCardFromFile() throws IOException, ParserConfigurationException, SAXException {
        File XMLFile = new File("src/main/resources/games.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(XMLFile);
        doc.getDocumentElement().normalize();
        NodeList cardList = doc.getElementsByTagName("card");
        for (int i = 0; i < cardList.getLength(); i++) {
            Node node = cardList.item(i);
            Element eElement = (Element) node;
            String name = eElement.getElementsByTagName("title").item(0).getTextContent();
            Card card = new Card(
                    name,
                    parseInt("metascore", eElement),
                    parseInt("userScore", eElement),
                    parseInt("number_of_copies", eElement),
                    parseInt("opening_income", eElement)
            );
            cards.add(card);
        }
        return cards;
    }

    public int parseInt(String attribute, Element element) {
        return Integer.parseInt(element.getElementsByTagName(attribute).item(0).getTextContent());
    }
}

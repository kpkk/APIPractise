package org.example;

import org.testng.annotations.Test;
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

public class ReadFromXML {

    @Test
    public void test() throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory document = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = document.newDocumentBuilder();
        Document parse = documentBuilder.parse(new File("./src/test/resources/CreateTicketResponse.xml"));
        parse.getDocumentElement().normalize();


        Node firstChild = parse.getNextSibling();
        Element nodeName = (Element) firstChild;
        System.out.println(nodeName.getTagName());
        NodeList childNodes = parse.getChildNodes();
        for (int i=0;i<childNodes.getLength();i++){
            Node item = childNodes.item(i);
            Element ele=(Element) item;
            System.out.println(ele.getTagName());
        }
       /* Element item = (Element) childNodes.item(0);
        System.out.println(item.getTagName());*/
    }
}
/*
  for (int i=0;i<elementsByTagName.getLength();i++){
           Node item = elementsByTagName.item(i);
           if(item.getNodeType()==Node.ELEMENT_NODE){
               Element ele= (Element) item;
               System.out.println(ele.getTagName());
           }

       }



    }
 */
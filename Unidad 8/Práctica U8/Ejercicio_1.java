import org.w3c.dom.*;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio_1 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        ArrayList<Alumnos> lista = new ArrayList<>();


        try {
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("alumnos.xml"));

            Element root = doc.getDocumentElement();
            NodeList nl = root.getElementsByTagName("alumno");

            for (int i = 0; i < nl.getLength(); i++) {
                String nombre="";
                String apellidos="";
                String direccion="";
                String dni="";

                Element node = (Element) nl.item(i);

                NamedNodeMap nodeMap = node.getAttributes();
                for (int j = 0; j < nodeMap.getLength() ; j++) {
                    Node node2 = nodeMap.item(j);
                    Attr atributo = node.getAttributeNode(node2.getNodeName());
                    if (atributo.getNodeName().equals("dni")) {
                        dni = atributo.getValue();
                    }
                }

                NodeList nl2 = nl.item(i).getChildNodes();

                for (int j = 0; j < nl2.getLength(); j++) {
                    if (nl2.item(j).getNodeType() == node.ELEMENT_NODE) {
                        Element e2 = (Element) nl2.item(j);
                        if (nl2.item(i).getLocalName() == "nombre") {
                            nombre = e2.getTextContent();
                        } else if (nl2.item(i).getLocalName() == "apellidos") {
                            apellidos = e2.getTextContent();
                        } else if (nl2.item(i).getLocalName() == "direccion") {
                            direccion = e2.getTextContent();
                        }
                    }
                }

                lista.add(new Alumnos(dni,nombre,apellidos,direccion));

            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
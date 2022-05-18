import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class ModificacionDOM {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db=dbf.newDocumentBuilder();
            Document doc=db.parse(new File("restaurante.xml"));

            Node root=doc.getDocumentElement();

            NodeList nl=doc.getElementsByTagName("plato");

            for (int i = 0; i <nl.getLength(); i++) {
                org.w3c.dom.Element disponible = doc.createElement("disponible");
                disponible.setTextContent("si");
                nl.item(i).appendChild(disponible);
            }

            Element plato=doc.createElement("plato");
            root.appendChild(plato);

            plato.setAttribute("calorias","800");

            Element nombre=doc.createElement("nombre");
            nombre.setTextContent("Pizza");

            Element precio=doc.createElement("precio");
            precio.setTextContent("15.10");

            Element disponible=doc.createElement("disponible");
            disponible.setTextContent("no");

            plato.appendChild(nombre);
            plato.appendChild(precio);
            plato.appendChild(disponible);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen=new DOMSource(root);

            File nuevo=new File("examen2.xml");
            StreamResult destino=new StreamResult(nuevo);

            transformer.transform(origen,destino);


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}

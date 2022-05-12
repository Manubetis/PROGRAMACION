
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.events.Characters;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

public class DOMModificado {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder db=dbf.newDocumentBuilder();

            Document doc=db.parse(new File("alumnos.xml"));

            Text saltoLinea = doc.createTextNode("\n");

            Node root=doc.getDocumentElement();

            NodeList nl = doc.getElementsByTagName("alumno");

            for (int i = 0; i <nl.getLength(); i++) {
                Element nombre = doc.createElement("instituto");
                nombre.setTextContent("IES ALIXAR");
                nl.item(i).appendChild(nombre);
            }

            Element persona = doc.createElement("alumno");
            persona.setAttribute("dni","8888888X");

            Element nombre= doc.createElement("nombre");
            nombre.setTextContent("Luis");

            Element apellidos= doc.createElement("apellidos");
            apellidos.setTextContent("Ruiz");

            Element direccion= doc.createElement("direccion");
            direccion.setTextContent("Allí");

            Element instituto = doc.createElement("instituto");
            instituto.setTextContent("IES ALIXAR");

            persona.appendChild(saltoLinea);
            persona.appendChild(nombre);
            persona.appendChild(apellidos);
            persona.appendChild(direccion);
            persona.appendChild(instituto);

            root.appendChild(persona);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origen= new DOMSource(root);

            File nuevoAlumno=new File("alumnos_modificado.xml");

            StreamResult destino= new StreamResult(nuevoAlumno);

            transformer.transform(origen, destino);

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

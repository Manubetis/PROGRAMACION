import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {
    public static void main(String[] args) {
        XMLInputFactory xmlInputFactory=XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlReader=xmlInputFactory.createXMLEventReader(new FileInputStream("restaurante.xml"));

            int totalPlatos=0;

            while (xmlReader.hasNext()){
                int atributoMayor=0;
                XMLEvent xmlEvent=xmlReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    StartElement startElement=xmlEvent.asStartElement();

                    if (startElement.isAttribute()){
                        Attribute attribute= (Attribute) startElement.getAttributes();
                        String contenido=attribute.getValue();
                        Integer contenidoInteger=Integer.getInteger(contenido);

                        if (startElement.getName().getLocalPart().equals("calorias")){
                            Attribute atributoActual= (Attribute) startElement.getAttributes();
                            String contenido2=attribute.getValue();
                            Integer contenidoInteger2=Integer.getInteger(contenido);

                            if (contenidoInteger>contenidoInteger2){
                                atributoMayor=contenidoInteger;
                            }else{
                                atributoMayor=contenidoInteger2;
                            }

                            if (startElement.isCharacters()){
                                Characters characters=startElement.asCharacters();
                                System.out.println(characters);
                            }
                        }
                    }
                    if (startElement.getName().getLocalPart()=="plato"){
                        totalPlatos++;
                    }
                }
            }

            System.out.println("Número total de platos que existen en la carta: "+totalPlatos);

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoStax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce una dirección");
        String direccion=sc.nextLine();

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        int cantidadAlumnos=0;
        int cantidadAlumnosDireccion=0;

        try {
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("alumnos.xml"));

            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();
                String tagName="";

                if (xmlEvent.isStartElement()){
                    StartElement startElement=xmlEvent.asStartElement();

                    tagName=startElement.getName().getLocalPart();
                    switch (tagName){
                        case "alumno":
                            cantidadAlumnos++;
                    }
                }else if (xmlEvent.isCharacters()){
                    tagName.equals(direccion);
                }
            }

            System.out.println("Cantidad de alumnos que hay en el fichero:");
            System.out.println(cantidadAlumnos);
            System.out.println();
            System.out.println("Cantidad de alumnos con la direccion "+direccion+" :");
            System.out.println(cantidadAlumnosDireccion);

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

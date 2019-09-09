package evgenyt.jacksondemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Jackson FasterXML sample
 * Aug 2019 EvgenyT
 */

public class App 
{
    public static void main( String[] args )
    {
        try {
            ObjectMapper mapper = new XmlMapper();
            // Person to XML
            Person person1 = new Person();
            person1.setName("Borden");
            String xml = mapper.writeValueAsString(person1);
            System.out.println("Person: " + person1.getName() + " -> XML: " + xml);
            // XML to Person
            Person person2 = mapper.readValue(xml, Person.class);
            System.out.println("XML: " + xml + " -> Person: " + person2.getName());
        } catch (Exception e) {e.printStackTrace();}
    }
}

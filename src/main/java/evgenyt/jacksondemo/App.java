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
            // Create two persons
            Person person1 = new Person();
            person1.setName("Borden");
            Person person2 = new Person();
            person2.setName("Enger");
            // Pack persons to root class
            Persons persons = new Persons(new Person[] {person1, person2});
            // Mapper to generate and read xml
            ObjectMapper mapper = new XmlMapper();
            // Generate xml with to created persons
            String xml = mapper.writeValueAsString(persons);
            System.out.println("XML: " + xml);
            // Generate persons by xml text
            Persons persons2 = mapper.readValue(xml, Persons.class);
            System.out.println("Persons:");
            for (Person person : persons2.getPerson()) {
                System.out.println(person);
            }
        } catch (Exception e) {e.printStackTrace();}
    }
}

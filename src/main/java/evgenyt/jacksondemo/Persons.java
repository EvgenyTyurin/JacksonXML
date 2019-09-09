package evgenyt.jacksondemo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * XML - person objects mapper
 */

// Root element
@JacksonXmlRootElement(localName = "persons")
public class Persons {
    // Person objects
    @JacksonXmlElementWrapper(localName = "person", useWrapping = false)
    private Person[] person;

    public Persons() {
    }

    public Persons(Person[] personList) {
        this.person = personList;
    }

    public Person[] getPerson() {
        return person;
    }

    public void setPerson(Person[] person) {
        this.person = person;
    }
}

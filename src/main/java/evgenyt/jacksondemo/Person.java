package evgenyt.jacksondemo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Person <-> XML mapper
 */

@JacksonXmlRootElement(localName="person")
public class Person {

    @JacksonXmlProperty(localName = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

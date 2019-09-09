package evgenyt.jacksondemo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Person object <-> XML mapper
 */

public class Person {

    // Property name mapping
    @JacksonXmlProperty(localName = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

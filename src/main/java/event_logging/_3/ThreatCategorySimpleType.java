//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.25 at 03:35:00 PM BST 
//


package event_logging._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThreatCategorySimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThreatCategorySimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Virus"/>
 *     &lt;enumeration value="Worm"/>
 *     &lt;enumeration value="HackingTool"/>
 *     &lt;enumeration value="Spyware"/>
 *     &lt;enumeration value="TrojanHorse"/>
 *     &lt;enumeration value="Adware"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThreatCategorySimpleType")
@XmlEnum
public enum ThreatCategorySimpleType {

    @XmlEnumValue("Virus")
    VIRUS("Virus"),
    @XmlEnumValue("Worm")
    WORM("Worm"),
    @XmlEnumValue("HackingTool")
    HACKING_TOOL("HackingTool"),
    @XmlEnumValue("Spyware")
    SPYWARE("Spyware"),
    @XmlEnumValue("TrojanHorse")
    TROJAN_HORSE("TrojanHorse"),
    @XmlEnumValue("Adware")
    ADWARE("Adware"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ThreatCategorySimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThreatCategorySimpleType fromValue(String v) {
        for (ThreatCategorySimpleType c: ThreatCategorySimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

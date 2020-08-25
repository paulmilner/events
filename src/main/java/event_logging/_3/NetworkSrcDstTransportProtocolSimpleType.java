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
 * <p>Java class for NetworkSrcDstTransportProtocolSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkSrcDstTransportProtocolSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TCP"/>
 *     &lt;enumeration value="UDP"/>
 *     &lt;enumeration value="ICMP"/>
 *     &lt;enumeration value="IGMP"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkSrcDstTransportProtocolSimpleType")
@XmlEnum
public enum NetworkSrcDstTransportProtocolSimpleType {

    TCP("TCP"),
    UDP("UDP"),
    ICMP("ICMP"),
    IGMP("IGMP"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    NetworkSrcDstTransportProtocolSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkSrcDstTransportProtocolSimpleType fromValue(String v) {
        for (NetworkSrcDstTransportProtocolSimpleType c: NetworkSrcDstTransportProtocolSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

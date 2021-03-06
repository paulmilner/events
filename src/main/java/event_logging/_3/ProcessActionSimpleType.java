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
 * <p>Java class for ProcessActionSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessActionSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Startup"/>
 *     &lt;enumeration value="Shutdown"/>
 *     &lt;enumeration value="Execute"/>
 *     &lt;enumeration value="Terminate"/>
 *     &lt;enumeration value="ChangeDir"/>
 *     &lt;enumeration value="Call"/>
 *     &lt;enumeration value="Access"/>
 *     &lt;enumeration value="RequestObjectHandle"/>
 *     &lt;enumeration value="Register"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessActionSimpleType")
@XmlEnum
public enum ProcessActionSimpleType {

    @XmlEnumValue("Startup")
    STARTUP("Startup"),
    @XmlEnumValue("Shutdown")
    SHUTDOWN("Shutdown"),
    @XmlEnumValue("Execute")
    EXECUTE("Execute"),
    @XmlEnumValue("Terminate")
    TERMINATE("Terminate"),
    @XmlEnumValue("ChangeDir")
    CHANGE_DIR("ChangeDir"),
    @XmlEnumValue("Call")
    CALL("Call"),
    @XmlEnumValue("Access")
    ACCESS("Access"),
    @XmlEnumValue("RequestObjectHandle")
    REQUEST_OBJECT_HANDLE("RequestObjectHandle"),
    @XmlEnumValue("Register")
    REGISTER("Register");
    private final String value;

    ProcessActionSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessActionSimpleType fromValue(String v) {
        for (ProcessActionSimpleType c: ProcessActionSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

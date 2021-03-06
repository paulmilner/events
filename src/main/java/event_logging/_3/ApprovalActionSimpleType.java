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
 * <p>Java class for ApprovalActionSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApprovalActionSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Approve"/>
 *     &lt;enumeration value="Accept"/>
 *     &lt;enumeration value="Reject"/>
 *     &lt;enumeration value="RequestApproval"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApprovalActionSimpleType")
@XmlEnum
public enum ApprovalActionSimpleType {

    @XmlEnumValue("Approve")
    APPROVE("Approve"),
    @XmlEnumValue("Accept")
    ACCEPT("Accept"),
    @XmlEnumValue("Reject")
    REJECT("Reject"),
    @XmlEnumValue("RequestApproval")
    REQUEST_APPROVAL("RequestApproval"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ApprovalActionSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApprovalActionSimpleType fromValue(String v) {
        for (ApprovalActionSimpleType c: ApprovalActionSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

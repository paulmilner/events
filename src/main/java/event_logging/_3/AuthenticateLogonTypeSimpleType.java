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
 * <p>Java class for AuthenticateLogonTypeSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticateLogonTypeSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Interactive"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="Batch"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Unlock"/>
 *     &lt;enumeration value="NetworkCleartext"/>
 *     &lt;enumeration value="NewCredentials"/>
 *     &lt;enumeration value="RemoteInteractive"/>
 *     &lt;enumeration value="CachedInteractive"/>
 *     &lt;enumeration value="CachedRemoteInteractive"/>
 *     &lt;enumeration value="CachedUnlock"/>
 *     &lt;enumeration value="Proxy"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticateLogonTypeSimpleType")
@XmlEnum
public enum AuthenticateLogonTypeSimpleType {

    @XmlEnumValue("Interactive")
    INTERACTIVE("Interactive"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("Batch")
    BATCH("Batch"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Unlock")
    UNLOCK("Unlock"),
    @XmlEnumValue("NetworkCleartext")
    NETWORK_CLEARTEXT("NetworkCleartext"),
    @XmlEnumValue("NewCredentials")
    NEW_CREDENTIALS("NewCredentials"),
    @XmlEnumValue("RemoteInteractive")
    REMOTE_INTERACTIVE("RemoteInteractive"),
    @XmlEnumValue("CachedInteractive")
    CACHED_INTERACTIVE("CachedInteractive"),
    @XmlEnumValue("CachedRemoteInteractive")
    CACHED_REMOTE_INTERACTIVE("CachedRemoteInteractive"),
    @XmlEnumValue("CachedUnlock")
    CACHED_UNLOCK("CachedUnlock"),
    @XmlEnumValue("Proxy")
    PROXY("Proxy"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AuthenticateLogonTypeSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticateLogonTypeSimpleType fromValue(String v) {
        for (AuthenticateLogonTypeSimpleType c: AuthenticateLogonTypeSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

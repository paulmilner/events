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
 * <p>Java class for AuthenticateOutcomeReasonSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticateOutcomeReasonSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IncorrectUsernameOrPassword"/>
 *     &lt;enumeration value="IncorrectUsername"/>
 *     &lt;enumeration value="IncorrectPassword"/>
 *     &lt;enumeration value="ExpiredCertificate"/>
 *     &lt;enumeration value="RevokedCertificate"/>
 *     &lt;enumeration value="IncorrectCA"/>
 *     &lt;enumeration value="ExpiredCA"/>
 *     &lt;enumeration value="AccountLocked"/>
 *     &lt;enumeration value="AccountNotValidForLoginType"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticateOutcomeReasonSimpleType")
@XmlEnum
public enum AuthenticateOutcomeReasonSimpleType {

    @XmlEnumValue("IncorrectUsernameOrPassword")
    INCORRECT_USERNAME_OR_PASSWORD("IncorrectUsernameOrPassword"),
    @XmlEnumValue("IncorrectUsername")
    INCORRECT_USERNAME("IncorrectUsername"),
    @XmlEnumValue("IncorrectPassword")
    INCORRECT_PASSWORD("IncorrectPassword"),
    @XmlEnumValue("ExpiredCertificate")
    EXPIRED_CERTIFICATE("ExpiredCertificate"),
    @XmlEnumValue("RevokedCertificate")
    REVOKED_CERTIFICATE("RevokedCertificate"),
    @XmlEnumValue("IncorrectCA")
    INCORRECT_CA("IncorrectCA"),
    @XmlEnumValue("ExpiredCA")
    EXPIRED_CA("ExpiredCA"),
    @XmlEnumValue("AccountLocked")
    ACCOUNT_LOCKED("AccountLocked"),
    @XmlEnumValue("AccountNotValidForLoginType")
    ACCOUNT_NOT_VALID_FOR_LOGIN_TYPE("AccountNotValidForLoginType"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AuthenticateOutcomeReasonSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticateOutcomeReasonSimpleType fromValue(String v) {
        for (AuthenticateOutcomeReasonSimpleType c: AuthenticateOutcomeReasonSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

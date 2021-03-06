//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.25 at 03:35:00 PM BST 
//


package event_logging._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure to describe the details of a send or receive event
 * 
 * <p>Java class for SendReceiveComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendReceiveComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="User" type="{event-logging:3}UserComplexType"/>
 *                   &lt;element name="Device" type="{event-logging:3}DeviceComplexType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Destination">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="User" type="{event-logging:3}UserComplexType"/>
 *                   &lt;element name="Device" type="{event-logging:3}DeviceComplexType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Payload" type="{event-logging:3}MultiObjectComplexType" minOccurs="0"/>
 *         &lt;element name="Outcome" type="{event-logging:3}OutcomeComplexType" minOccurs="0"/>
 *         &lt;element name="Data" type="{event-logging:3}DataComplexType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendReceiveComplexType", propOrder = {
    "source",
    "destination",
    "payload",
    "outcome",
    "data"
})
public class SendReceiveComplexType {

    @XmlElement(name = "Source", required = true)
    protected SendReceiveComplexType.Source source;
    @XmlElement(name = "Destination", required = true)
    protected SendReceiveComplexType.Destination destination;
    @XmlElement(name = "Payload")
    protected MultiObjectComplexType payload;
    @XmlElement(name = "Outcome")
    protected OutcomeComplexType outcome;
    @XmlElement(name = "Data")
    protected List<DataComplexType> data;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SendReceiveComplexType.Source }
     *     
     */
    public SendReceiveComplexType.Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendReceiveComplexType.Source }
     *     
     */
    public void setSource(SendReceiveComplexType.Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link SendReceiveComplexType.Destination }
     *     
     */
    public SendReceiveComplexType.Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendReceiveComplexType.Destination }
     *     
     */
    public void setDestination(SendReceiveComplexType.Destination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link MultiObjectComplexType }
     *     
     */
    public MultiObjectComplexType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiObjectComplexType }
     *     
     */
    public void setPayload(MultiObjectComplexType value) {
        this.payload = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeComplexType }
     *     
     */
    public OutcomeComplexType getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeComplexType }
     *     
     */
    public void setOutcome(OutcomeComplexType value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataComplexType }
     * 
     * 
     */
    public List<DataComplexType> getData() {
        if (data == null) {
            data = new ArrayList<DataComplexType>();
        }
        return this.data;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="User" type="{event-logging:3}UserComplexType"/>
     *         &lt;element name="Device" type="{event-logging:3}DeviceComplexType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userOrDevice"
    })
    public static class Destination {

        @XmlElements({
            @XmlElement(name = "User", type = UserComplexType.class),
            @XmlElement(name = "Device", type = DeviceComplexType.class)
        })
        protected List<Object> userOrDevice;

        /**
         * Gets the value of the userOrDevice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userOrDevice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserOrDevice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserComplexType }
         * {@link DeviceComplexType }
         * 
         * 
         */
        public List<Object> getUserOrDevice() {
            if (userOrDevice == null) {
                userOrDevice = new ArrayList<Object>();
            }
            return this.userOrDevice;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="User" type="{event-logging:3}UserComplexType"/>
     *         &lt;element name="Device" type="{event-logging:3}DeviceComplexType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userOrDevice"
    })
    public static class Source {

        @XmlElements({
            @XmlElement(name = "User", type = UserComplexType.class),
            @XmlElement(name = "Device", type = DeviceComplexType.class)
        })
        protected List<Object> userOrDevice;

        /**
         * Gets the value of the userOrDevice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userOrDevice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserOrDevice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserComplexType }
         * {@link DeviceComplexType }
         * 
         * 
         */
        public List<Object> getUserOrDevice() {
            if (userOrDevice == null) {
                userOrDevice = new ArrayList<Object>();
            }
            return this.userOrDevice;
        }

    }

}

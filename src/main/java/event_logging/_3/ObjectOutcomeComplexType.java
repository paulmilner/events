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
import javax.xml.bind.annotation.XmlType;


/**
 * Contains an item of data, e.g. a file, document, etc, and describes the outcome of the event as well as providing for additional event data that does not fit into the item of data element.
 * 
 * <p>Java class for ObjectOutcomeComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectOutcomeComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{event-logging:3}BaseMultiObjectComplexType">
 *       &lt;sequence>
 *         &lt;element name="Outcome" type="{event-logging:3}OutcomeComplexType" minOccurs="0"/>
 *         &lt;element name="Data" type="{event-logging:3}DataComplexType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectOutcomeComplexType", propOrder = {
    "outcome",
    "data"
})
public class ObjectOutcomeComplexType
    extends BaseMultiObjectComplexType
{

    @XmlElement(name = "Outcome")
    protected OutcomeComplexType outcome;
    @XmlElement(name = "Data")
    protected List<DataComplexType> data;

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

}

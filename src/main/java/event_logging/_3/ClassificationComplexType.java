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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes the classification and access controls for an item such as a document, record, file, etc.
 * 
 * <p>Java class for ClassificationComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Originator" type="{event-logging:3}OrganisationComplexType" minOccurs="0"/>
 *         &lt;element name="Custodian" type="{event-logging:3}OrganisationComplexType" minOccurs="0"/>
 *         &lt;element name="Classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descriptors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrGroups" type="{event-logging:3}AccessControlGroupsComplexType" minOccurs="0"/>
 *         &lt;element name="AndGroups" type="{event-logging:3}AccessControlGroupsComplexType" minOccurs="0"/>
 *         &lt;element name="PermittedNationalities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Nationality" type="{event-logging:3}CountryTrigraphSimpleType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PermittedOrganisations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PermittedOrganisation" type="{event-logging:3}OrganisationComplexType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DisseminationControls" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DisseminationControl" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Disposition" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Date" type="{event-logging:3}DateTimeSimpleType"/>
 *                   &lt;element name="Process" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ClassificationComplexType", propOrder = {
    "text",
    "originator",
    "custodian",
    "classification",
    "descriptors",
    "orGroups",
    "andGroups",
    "permittedNationalities",
    "permittedOrganisations",
    "disseminationControls",
    "disposition",
    "data"
})
public class ClassificationComplexType {

    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Originator")
    protected OrganisationComplexType originator;
    @XmlElement(name = "Custodian")
    protected OrganisationComplexType custodian;
    @XmlElement(name = "Classification")
    protected String classification;
    @XmlElement(name = "Descriptors")
    protected ClassificationComplexType.Descriptors descriptors;
    @XmlElement(name = "OrGroups")
    protected AccessControlGroupsComplexType orGroups;
    @XmlElement(name = "AndGroups")
    protected AccessControlGroupsComplexType andGroups;
    @XmlElement(name = "PermittedNationalities")
    protected ClassificationComplexType.PermittedNationalities permittedNationalities;
    @XmlElement(name = "PermittedOrganisations")
    protected ClassificationComplexType.PermittedOrganisations permittedOrganisations;
    @XmlElement(name = "DisseminationControls")
    protected ClassificationComplexType.DisseminationControls disseminationControls;
    @XmlElement(name = "Disposition")
    protected ClassificationComplexType.Disposition disposition;
    @XmlElement(name = "Data")
    protected List<DataComplexType> data;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationComplexType }
     *     
     */
    public OrganisationComplexType getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationComplexType }
     *     
     */
    public void setOriginator(OrganisationComplexType value) {
        this.originator = value;
    }

    /**
     * Gets the value of the custodian property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationComplexType }
     *     
     */
    public OrganisationComplexType getCustodian() {
        return custodian;
    }

    /**
     * Sets the value of the custodian property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationComplexType }
     *     
     */
    public void setCustodian(OrganisationComplexType value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the descriptors property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationComplexType.Descriptors }
     *     
     */
    public ClassificationComplexType.Descriptors getDescriptors() {
        return descriptors;
    }

    /**
     * Sets the value of the descriptors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationComplexType.Descriptors }
     *     
     */
    public void setDescriptors(ClassificationComplexType.Descriptors value) {
        this.descriptors = value;
    }

    /**
     * Gets the value of the orGroups property.
     * 
     * @return
     *     possible object is
     *     {@link AccessControlGroupsComplexType }
     *     
     */
    public AccessControlGroupsComplexType getOrGroups() {
        return orGroups;
    }

    /**
     * Sets the value of the orGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessControlGroupsComplexType }
     *     
     */
    public void setOrGroups(AccessControlGroupsComplexType value) {
        this.orGroups = value;
    }

    /**
     * Gets the value of the andGroups property.
     * 
     * @return
     *     possible object is
     *     {@link AccessControlGroupsComplexType }
     *     
     */
    public AccessControlGroupsComplexType getAndGroups() {
        return andGroups;
    }

    /**
     * Sets the value of the andGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessControlGroupsComplexType }
     *     
     */
    public void setAndGroups(AccessControlGroupsComplexType value) {
        this.andGroups = value;
    }

    /**
     * Gets the value of the permittedNationalities property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationComplexType.PermittedNationalities }
     *     
     */
    public ClassificationComplexType.PermittedNationalities getPermittedNationalities() {
        return permittedNationalities;
    }

    /**
     * Sets the value of the permittedNationalities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationComplexType.PermittedNationalities }
     *     
     */
    public void setPermittedNationalities(ClassificationComplexType.PermittedNationalities value) {
        this.permittedNationalities = value;
    }

    /**
     * Gets the value of the permittedOrganisations property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationComplexType.PermittedOrganisations }
     *     
     */
    public ClassificationComplexType.PermittedOrganisations getPermittedOrganisations() {
        return permittedOrganisations;
    }

    /**
     * Sets the value of the permittedOrganisations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationComplexType.PermittedOrganisations }
     *     
     */
    public void setPermittedOrganisations(ClassificationComplexType.PermittedOrganisations value) {
        this.permittedOrganisations = value;
    }

    /**
     * Gets the value of the disseminationControls property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationComplexType.DisseminationControls }
     *     
     */
    public ClassificationComplexType.DisseminationControls getDisseminationControls() {
        return disseminationControls;
    }

    /**
     * Sets the value of the disseminationControls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationComplexType.DisseminationControls }
     *     
     */
    public void setDisseminationControls(ClassificationComplexType.DisseminationControls value) {
        this.disseminationControls = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationComplexType.Disposition }
     *     
     */
    public ClassificationComplexType.Disposition getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationComplexType.Disposition }
     *     
     */
    public void setDisposition(ClassificationComplexType.Disposition value) {
        this.disposition = value;
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
     *       &lt;sequence>
     *         &lt;element name="Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "descriptor"
    })
    public static class Descriptors {

        @XmlElement(name = "Descriptor", required = true)
        protected List<String> descriptor;

        /**
         * Gets the value of the descriptor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descriptor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescriptor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDescriptor() {
            if (descriptor == null) {
                descriptor = new ArrayList<String>();
            }
            return this.descriptor;
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
     *       &lt;sequence>
     *         &lt;element name="Date" type="{event-logging:3}DateTimeSimpleType"/>
     *         &lt;element name="Process" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "date",
        "process"
    })
    public static class Disposition {

        @XmlElement(name = "Date", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlElement(name = "Process", required = true)
        protected String process;

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the process property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcess() {
            return process;
        }

        /**
         * Sets the value of the process property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcess(String value) {
            this.process = value;
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
     *       &lt;sequence>
     *         &lt;element name="DisseminationControl" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "disseminationControl"
    })
    public static class DisseminationControls {

        @XmlElement(name = "DisseminationControl", required = true)
        protected List<String> disseminationControl;

        /**
         * Gets the value of the disseminationControl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disseminationControl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDisseminationControl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDisseminationControl() {
            if (disseminationControl == null) {
                disseminationControl = new ArrayList<String>();
            }
            return this.disseminationControl;
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
     *       &lt;sequence>
     *         &lt;element name="Nationality" type="{event-logging:3}CountryTrigraphSimpleType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nationality"
    })
    public static class PermittedNationalities {

        @XmlElement(name = "Nationality", required = true)
        protected List<String> nationality;

        /**
         * Gets the value of the nationality property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nationality property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNationality().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNationality() {
            if (nationality == null) {
                nationality = new ArrayList<String>();
            }
            return this.nationality;
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
     *       &lt;sequence>
     *         &lt;element name="PermittedOrganisation" type="{event-logging:3}OrganisationComplexType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "permittedOrganisation"
    })
    public static class PermittedOrganisations {

        @XmlElement(name = "PermittedOrganisation", required = true)
        protected OrganisationComplexType permittedOrganisation;

        /**
         * Gets the value of the permittedOrganisation property.
         * 
         * @return
         *     possible object is
         *     {@link OrganisationComplexType }
         *     
         */
        public OrganisationComplexType getPermittedOrganisation() {
            return permittedOrganisation;
        }

        /**
         * Sets the value of the permittedOrganisation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganisationComplexType }
         *     
         */
        public void setPermittedOrganisation(OrganisationComplexType value) {
            this.permittedOrganisation = value;
        }

    }

}
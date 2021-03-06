//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.25 at 03:35:00 PM BST 
//


package event_logging._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure used to describe a set of search results from a query where the results are viewed or interacted with in a separate event to the execution of the query. E.g. for long running queries where the results are stored for later viewing/processing. The Search schema action should be used to describe the event for the execution of the search. Query/Id or Query/Name can be used to associated the results event with the query event.
 * 
 * <p>Java class for SearchResultsComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResultsComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{event-logging:3}BaseObjectComplexType">
 *       &lt;sequence>
 *         &lt;group ref="{event-logging:3}CriteriaExtensionGroup"/>
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
@XmlType(name = "SearchResultsComplexType", propOrder = {
    "dataSources",
    "query",
    "resultPage",
    "totalResults",
    "results",
    "data"
})
public class SearchResultsComplexType
    extends BaseObjectComplexType
{

    @XmlElement(name = "DataSources")
    protected event_logging._3.SearchComplexType.DataSources dataSources;
    @XmlElement(name = "Query")
    protected QueryComplexType query;
    @XmlElement(name = "ResultPage")
    protected event_logging._3.SearchComplexType.ResultPage resultPage;
    @XmlElement(name = "TotalResults")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalResults;
    @XmlElement(name = "Results")
    protected MultiObjectComplexType results;
    @XmlElement(name = "Data")
    protected List<DataComplexType> data;

    /**
     * Gets the value of the dataSources property.
     * 
     * @return
     *     possible object is
     *     {@link event_logging._3.SearchComplexType.DataSources }
     *     
     */
    public event_logging._3.SearchComplexType.DataSources getDataSources() {
        return dataSources;
    }

    /**
     * Sets the value of the dataSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link event_logging._3.SearchComplexType.DataSources }
     *     
     */
    public void setDataSources(event_logging._3.SearchComplexType.DataSources value) {
        this.dataSources = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link QueryComplexType }
     *     
     */
    public QueryComplexType getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryComplexType }
     *     
     */
    public void setQuery(QueryComplexType value) {
        this.query = value;
    }

    /**
     * Gets the value of the resultPage property.
     * 
     * @return
     *     possible object is
     *     {@link event_logging._3.SearchComplexType.ResultPage }
     *     
     */
    public event_logging._3.SearchComplexType.ResultPage getResultPage() {
        return resultPage;
    }

    /**
     * Sets the value of the resultPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link event_logging._3.SearchComplexType.ResultPage }
     *     
     */
    public void setResultPage(event_logging._3.SearchComplexType.ResultPage value) {
        this.resultPage = value;
    }

    /**
     * Gets the value of the totalResults property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalResults(BigInteger value) {
        this.totalResults = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link MultiObjectComplexType }
     *     
     */
    public MultiObjectComplexType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiObjectComplexType }
     *     
     */
    public void setResults(MultiObjectComplexType value) {
        this.results = value;
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

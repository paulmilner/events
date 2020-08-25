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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseMultiObjectComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseMultiObjectComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Association" type="{event-logging:3}AssociationComplexType"/>
 *         &lt;element name="Banner" type="{event-logging:3}BannerComplexType"/>
 *         &lt;element name="Chat" type="{event-logging:3}ChatComplexType"/>
 *         &lt;element name="Configuration" type="{event-logging:3}ConfigurationComplexType"/>
 *         &lt;element name="Criteria" type="{event-logging:3}CriteriaComplexType"/>
 *         &lt;element name="Document" type="{event-logging:3}DocumentComplexType"/>
 *         &lt;element name="Email" type="{event-logging:3}EmailComplexType"/>
 *         &lt;element name="File" type="{event-logging:3}FileComplexType"/>
 *         &lt;element name="Folder" type="{event-logging:3}FolderComplexType"/>
 *         &lt;element name="Group" type="{event-logging:3}GroupComplexType"/>
 *         &lt;element name="GroupChat" type="{event-logging:3}GroupChatComplexType"/>
 *         &lt;element name="Object" type="{event-logging:3}ObjectComplexType"/>
 *         &lt;element name="SearchResult" type="{event-logging:3}SearchResultComplexType"/>
 *         &lt;element name="SearchResults" type="{event-logging:3}SearchResultsComplexType"/>
 *         &lt;element name="Shortcut" type="{event-logging:3}ShortcutComplexType"/>
 *         &lt;element name="User" type="{event-logging:3}UserComplexType"/>
 *         &lt;element name="VirtualSession" type="{event-logging:3}VirtualSessionComplexType"/>
 *         &lt;element name="VOIP" type="{event-logging:3}VOIPComplexType"/>
 *         &lt;element name="Resource" type="{event-logging:3}ResourceComplexType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMultiObjectComplexType", propOrder = {
    "associationOrBannerOrChat"
})
@XmlSeeAlso({
    event_logging._3.Events.Event.EventDetail.Authorise.class,
    ObjectOutcomeComplexType.class,
    MultiObjectComplexType.class
})
public abstract class BaseMultiObjectComplexType {

    @XmlElements({
        @XmlElement(name = "Association", type = AssociationComplexType.class),
        @XmlElement(name = "Banner", type = BannerComplexType.class),
        @XmlElement(name = "Chat", type = ChatComplexType.class),
        @XmlElement(name = "Configuration", type = ConfigurationComplexType.class),
        @XmlElement(name = "Criteria", type = CriteriaComplexType.class),
        @XmlElement(name = "Document", type = DocumentComplexType.class),
        @XmlElement(name = "Email", type = EmailComplexType.class),
        @XmlElement(name = "File", type = FileComplexType.class),
        @XmlElement(name = "Folder", type = FolderComplexType.class),
        @XmlElement(name = "Group", type = GroupComplexType.class),
        @XmlElement(name = "GroupChat", type = GroupChatComplexType.class),
        @XmlElement(name = "Object", type = ObjectComplexType.class),
        @XmlElement(name = "SearchResult", type = SearchResultComplexType.class),
        @XmlElement(name = "SearchResults", type = SearchResultsComplexType.class),
        @XmlElement(name = "Shortcut", type = ShortcutComplexType.class),
        @XmlElement(name = "User", type = UserComplexType.class),
        @XmlElement(name = "VirtualSession", type = VirtualSessionComplexType.class),
        @XmlElement(name = "VOIP", type = VOIPComplexType.class),
        @XmlElement(name = "Resource", type = ResourceComplexType.class)
    })
    protected List<BaseObjectComplexType> associationOrBannerOrChat;

    /**
     * Gets the value of the associationOrBannerOrChat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associationOrBannerOrChat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociationOrBannerOrChat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationComplexType }
     * {@link BannerComplexType }
     * {@link ChatComplexType }
     * {@link ConfigurationComplexType }
     * {@link CriteriaComplexType }
     * {@link DocumentComplexType }
     * {@link EmailComplexType }
     * {@link FileComplexType }
     * {@link FolderComplexType }
     * {@link GroupComplexType }
     * {@link GroupChatComplexType }
     * {@link ObjectComplexType }
     * {@link SearchResultComplexType }
     * {@link SearchResultsComplexType }
     * {@link ShortcutComplexType }
     * {@link UserComplexType }
     * {@link VirtualSessionComplexType }
     * {@link VOIPComplexType }
     * {@link ResourceComplexType }
     * 
     * 
     */
    public List<BaseObjectComplexType> getAssociationOrBannerOrChat() {
        if (associationOrBannerOrChat == null) {
            associationOrBannerOrChat = new ArrayList<BaseObjectComplexType>();
        }
        return this.associationOrBannerOrChat;
    }

}

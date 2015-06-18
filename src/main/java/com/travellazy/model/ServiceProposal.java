
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A proposal for a service to be created.
 *             
 * 
 * <p>Java class for ServiceProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProposal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountComponentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="featureGroups" type="{http://www.travellazy.com/product/model}FeatureGroupProposals" minOccurs="0"/>
 *         &lt;element name="charges" type="{http://www.travellazy.com/product/model}AbstractCharges" minOccurs="0"/>
 *         &lt;element name="serviceProposals" type="{http://www.travellazy.com/product/model}ServiceProposals" minOccurs="0"/>
 *         &lt;element name="selectableServices" type="{http://www.travellazy.com/product/model}SelectableServices" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "accountComponentId",
    "displayName",
    "description",
    "displayOrder",
    "featureGroups",
    "charges",
    "serviceProposals",
    "selectableServices"
})
@XmlSeeAlso({
    SelectableService.class
})
public class ServiceProposal {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long accountComponentId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String displayName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer displayOrder;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureGroupProposals featureGroups;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractCharges charges;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ServiceProposals serviceProposals;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected SelectableServices selectableServices;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the accountComponentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountComponentId() {
        return accountComponentId;
    }

    /**
     * Sets the value of the accountComponentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountComponentId(Long value) {
        this.accountComponentId = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the featureGroups property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureGroupProposals }
     *     
     */
    public FeatureGroupProposals getFeatureGroups() {
        return featureGroups;
    }

    /**
     * Sets the value of the featureGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureGroupProposals }
     *     
     */
    public void setFeatureGroups(FeatureGroupProposals value) {
        this.featureGroups = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractCharges }
     *     
     */
    public AbstractCharges getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractCharges }
     *     
     */
    public void setCharges(AbstractCharges value) {
        this.charges = value;
    }

    /**
     * Gets the value of the serviceProposals property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProposals }
     *     
     */
    public ServiceProposals getServiceProposals() {
        return serviceProposals;
    }

    /**
     * Sets the value of the serviceProposals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProposals }
     *     
     */
    public void setServiceProposals(ServiceProposals value) {
        this.serviceProposals = value;
    }

    /**
     * Gets the value of the selectableServices property.
     * 
     * @return
     *     possible object is
     *     {@link SelectableServices }
     *     
     */
    public SelectableServices getSelectableServices() {
        return selectableServices;
    }

    /**
     * Sets the value of the selectableServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableServices }
     *     
     */
    public void setSelectableServices(SelectableServices value) {
        this.selectableServices = value;
    }

}


package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Contains a list of offer groups including
 *                 information about selectable base
 *                 offers and
 *                 selected base offer
 *                 instances.
 *             
 * 
 * <p>Java class for OfferGroupProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferGroupProposal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfSelectedInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="maxNumberOfInstances" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="baseOffers" type="{http://www.travellazy.com/product/model}BaseOfferProposals" minOccurs="0"/>
 *         &lt;element name="selectableGroupOffers" type="{http://www.travellazy.com/product/model}SelectableGroupOffers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferGroupProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "numberOfSelectedInstances",
    "minNumberOfInstances",
    "maxNumberOfInstances",
    "baseOffers",
    "selectableGroupOffers"
})
public class OfferGroupProposal {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer numberOfSelectedInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Short minNumberOfInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Short maxNumberOfInstances;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BaseOfferProposals baseOffers;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected SelectableGroupOffers selectableGroupOffers;

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
     * Gets the value of the numberOfSelectedInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSelectedInstances() {
        return numberOfSelectedInstances;
    }

    /**
     * Sets the value of the numberOfSelectedInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSelectedInstances(Integer value) {
        this.numberOfSelectedInstances = value;
    }

    /**
     * Gets the value of the minNumberOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMinNumberOfInstances() {
        return minNumberOfInstances;
    }

    /**
     * Sets the value of the minNumberOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMinNumberOfInstances(Short value) {
        this.minNumberOfInstances = value;
    }

    /**
     * Gets the value of the maxNumberOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMaxNumberOfInstances() {
        return maxNumberOfInstances;
    }

    /**
     * Sets the value of the maxNumberOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMaxNumberOfInstances(Short value) {
        this.maxNumberOfInstances = value;
    }

    /**
     * Gets the value of the baseOffers property.
     * 
     * @return
     *     possible object is
     *     {@link BaseOfferProposals }
     *     
     */
    public BaseOfferProposals getBaseOffers() {
        return baseOffers;
    }

    /**
     * Sets the value of the baseOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseOfferProposals }
     *     
     */
    public void setBaseOffers(BaseOfferProposals value) {
        this.baseOffers = value;
    }

    /**
     * Gets the value of the selectableGroupOffers property.
     * 
     * @return
     *     possible object is
     *     {@link SelectableGroupOffers }
     *     
     */
    public SelectableGroupOffers getSelectableGroupOffers() {
        return selectableGroupOffers;
    }

    /**
     * Sets the value of the selectableGroupOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectableGroupOffers }
     *     
     */
    public void setSelectableGroupOffers(SelectableGroupOffers value) {
        this.selectableGroupOffers = value;
    }

}


package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 An OfferProposals can either be a base or bundle
 *                 offer.
 *                 Bundle offer includes information
 *                 about selected and
 *                 available
 *                 base offers and bundle offer features.
 *                 This includes selected and
 *                 available
 *                 service and offer
 *                 features
 *                 including
 *                 parameters,
 *                 modification information and charges.
 *             
 * 
 * <p>Java class for AbstractOfferProposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractOfferProposal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="internalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customizedOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationErrors" type="{http://www.travellazy.com/product/model}ValidationErrors" minOccurs="0"/>
 *         &lt;element name="modification" type="{http://www.travellazy.com/product/model}ProductCatalogOfferModification" minOccurs="0"/>
 *         &lt;element name="featureGroups" type="{http://www.travellazy.com/product/model}FeatureGroupProposals" minOccurs="0"/>
 *         &lt;element name="featureGroupCategories" type="{http://www.travellazy.com/product/model}FeatureGroupCategories" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractOfferProposal", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offerKey",
    "internalName",
    "invoiceName",
    "description",
    "customizedOfferId",
    "validationErrors",
    "modification",
    "featureGroups",
    "featureGroupCategories"
})
@XmlSeeAlso({
    BundleOfferProposal.class,
    BaseOfferProposal.class
})
public abstract class AbstractOfferProposal {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String offerKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String internalName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String invoiceName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String customizedOfferId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ValidationErrors validationErrors;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected ProductCatalogOfferModification modification;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureGroupProposals featureGroups;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureGroupCategories featureGroupCategories;

    /**
     * Gets the value of the offerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferKey() {
        return offerKey;
    }

    /**
     * Sets the value of the offerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferKey(String value) {
        this.offerKey = value;
    }

    /**
     * Gets the value of the internalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalName() {
        return internalName;
    }

    /**
     * Sets the value of the internalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalName(String value) {
        this.internalName = value;
    }

    /**
     * Gets the value of the invoiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceName() {
        return invoiceName;
    }

    /**
     * Sets the value of the invoiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceName(String value) {
        this.invoiceName = value;
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
     * Gets the value of the customizedOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomizedOfferId() {
        return customizedOfferId;
    }

    /**
     * Sets the value of the customizedOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomizedOfferId(String value) {
        this.customizedOfferId = value;
    }

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationErrors }
     *     
     */
    public ValidationErrors getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationErrors }
     *     
     */
    public void setValidationErrors(ValidationErrors value) {
        this.validationErrors = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCatalogOfferModification }
     *     
     */
    public ProductCatalogOfferModification getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCatalogOfferModification }
     *     
     */
    public void setModification(ProductCatalogOfferModification value) {
        this.modification = value;
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
     * Gets the value of the featureGroupCategories property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureGroupCategories }
     *     
     */
    public FeatureGroupCategories getFeatureGroupCategories() {
        return featureGroupCategories;
    }

    /**
     * Sets the value of the featureGroupCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureGroupCategories }
     *     
     */
    public void setFeatureGroupCategories(FeatureGroupCategories value) {
        this.featureGroupCategories = value;
    }

}

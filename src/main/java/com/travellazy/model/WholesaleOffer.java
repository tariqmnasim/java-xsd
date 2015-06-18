
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WholesaleOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WholesaleOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="internalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="tariffModelKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offerTemplateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wholesaleProductKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="featureGroupReferences" type="{http://www.travellazy.com/product/model}FeatureGroupReferenceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WholesaleOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "key",
    "description",
    "invoiceName",
    "internalName",
    "activation",
    "termination",
    "tariffModelKey",
    "offerTemplateKey",
    "wholesaleProductKey",
    "featureGroupReferences"
})
public class WholesaleOffer {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String key;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String description;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String invoiceName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String internalName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activation;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termination;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String tariffModelKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String offerTemplateKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String wholesaleProductKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureGroupReferenceList featureGroupReferences;

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
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivation(XMLGregorianCalendar value) {
        this.activation = value;
    }

    /**
     * Gets the value of the termination property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermination() {
        return termination;
    }

    /**
     * Sets the value of the termination property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermination(XMLGregorianCalendar value) {
        this.termination = value;
    }

    /**
     * Gets the value of the tariffModelKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffModelKey() {
        return tariffModelKey;
    }

    /**
     * Sets the value of the tariffModelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffModelKey(String value) {
        this.tariffModelKey = value;
    }

    /**
     * Gets the value of the offerTemplateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTemplateKey() {
        return offerTemplateKey;
    }

    /**
     * Sets the value of the offerTemplateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTemplateKey(String value) {
        this.offerTemplateKey = value;
    }

    /**
     * Gets the value of the wholesaleProductKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWholesaleProductKey() {
        return wholesaleProductKey;
    }

    /**
     * Sets the value of the wholesaleProductKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWholesaleProductKey(String value) {
        this.wholesaleProductKey = value;
    }

    /**
     * Gets the value of the featureGroupReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureGroupReferenceList }
     *     
     */
    public FeatureGroupReferenceList getFeatureGroupReferences() {
        return featureGroupReferences;
    }

    /**
     * Sets the value of the featureGroupReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureGroupReferenceList }
     *     
     */
    public void setFeatureGroupReferences(FeatureGroupReferenceList value) {
        this.featureGroupReferences = value;
    }

}

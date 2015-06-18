
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbstractCustomizedOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCustomizedOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="internalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offerTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offerStatusKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCustomizedOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "id",
    "offerKey",
    "internalName",
    "invoiceName",
    "offerTypeKey",
    "offerStatusKey",
    "activation",
    "termination"
})
@XmlSeeAlso({
    CustomizedBundleOffer.class,
    CustomizedBaseOffer.class
})
public abstract class AbstractCustomizedOffer {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long id;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String offerKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String internalName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String invoiceName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String offerTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String offerStatusKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activation;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar termination;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

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
     * Gets the value of the offerTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTypeKey() {
        return offerTypeKey;
    }

    /**
     * Sets the value of the offerTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTypeKey(String value) {
        this.offerTypeKey = value;
    }

    /**
     * Gets the value of the offerStatusKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferStatusKey() {
        return offerStatusKey;
    }

    /**
     * Sets the value of the offerStatusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferStatusKey(String value) {
        this.offerStatusKey = value;
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

}

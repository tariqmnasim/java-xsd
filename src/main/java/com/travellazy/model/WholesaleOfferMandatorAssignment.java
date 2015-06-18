
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WholesaleOfferMandatorAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WholesaleOfferMandatorAssignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wholesaleOfferKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mandatorKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="termination" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WholesaleOfferMandatorAssignment", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "wholesaleOfferKey",
    "mandatorKey",
    "activation",
    "termination"
})
public class WholesaleOfferMandatorAssignment {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String wholesaleOfferKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String mandatorKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activation;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termination;

    /**
     * Gets the value of the wholesaleOfferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWholesaleOfferKey() {
        return wholesaleOfferKey;
    }

    /**
     * Sets the value of the wholesaleOfferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWholesaleOfferKey(String value) {
        this.wholesaleOfferKey = value;
    }

    /**
     * Gets the value of the mandatorKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatorKey() {
        return mandatorKey;
    }

    /**
     * Sets the value of the mandatorKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatorKey(String value) {
        this.mandatorKey = value;
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

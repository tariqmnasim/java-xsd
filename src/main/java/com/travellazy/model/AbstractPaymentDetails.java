
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbstractPaymentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPaymentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentMethodKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paymentParameters" type="{http://www.travellazy.com/product/model}Parameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPaymentDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "paymentMethodKey",
    "paymentTypeKey",
    "activationDate",
    "paymentParameters"
})
@XmlSeeAlso({
    CreatePaymentDetails.class,
    UpdatePaymentDetails.class
})
public abstract class AbstractPaymentDetails {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String paymentMethodKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String paymentTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Parameters paymentParameters;

    /**
     * Gets the value of the paymentMethodKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodKey() {
        return paymentMethodKey;
    }

    /**
     * Sets the value of the paymentMethodKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodKey(String value) {
        this.paymentMethodKey = value;
    }

    /**
     * Gets the value of the paymentTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeKey() {
        return paymentTypeKey;
    }

    /**
     * Sets the value of the paymentTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeKey(String value) {
        this.paymentTypeKey = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the paymentParameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getPaymentParameters() {
        return paymentParameters;
    }

    /**
     * Sets the value of the paymentParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setPaymentParameters(Parameters value) {
        this.paymentParameters = value;
    }

}

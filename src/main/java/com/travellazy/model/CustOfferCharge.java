
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                 Charge that is a part of a customized offer. I.e. it can be recurring, once-only or instalment.
 *             
 * 
 * <p>Java class for CustOfferCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustOfferCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}ChargeBase">
 *       &lt;sequence>
 *         &lt;element name="chargedFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="chargedUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="chargeTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustOfferCharge", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "chargedFrom",
    "chargedUntil"
})
public class CustOfferCharge
    extends ChargeBase
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chargedFrom;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chargedUntil;
    @XmlAttribute(name = "chargeTypeKey")
    protected String chargeTypeKey;

    /**
     * Gets the value of the chargedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargedFrom() {
        return chargedFrom;
    }

    /**
     * Sets the value of the chargedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargedFrom(XMLGregorianCalendar value) {
        this.chargedFrom = value;
    }

    /**
     * Gets the value of the chargedUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargedUntil() {
        return chargedUntil;
    }

    /**
     * Sets the value of the chargedUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargedUntil(XMLGregorianCalendar value) {
        this.chargedUntil = value;
    }

    /**
     * Gets the value of the chargeTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    /**
     * Sets the value of the chargeTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeTypeKey(String value) {
        this.chargeTypeKey = value;
    }

}

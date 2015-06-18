
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Contains a list of account charges along with charges and usage sums per bill type, split by separate
 *                 customized offers.
 *             
 * 
 * <p>Java class for ItemizedInvoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemizedInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charges" type="{http://www.travellazy.com/product/model}AccountChargesList" minOccurs="0"/>
 *         &lt;element name="offers" type="{http://www.travellazy.com/product/model}CustomizedOfferList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemizedInvoice", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "charges",
    "offers"
})
public class ItemizedInvoice {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AccountChargesList charges;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CustomizedOfferList offers;

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link AccountChargesList }
     *     
     */
    public AccountChargesList getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountChargesList }
     *     
     */
    public void setCharges(AccountChargesList value) {
        this.charges = value;
    }

    /**
     * Gets the value of the offers property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizedOfferList }
     *     
     */
    public CustomizedOfferList getOffers() {
        return offers;
    }

    /**
     * Sets the value of the offers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizedOfferList }
     *     
     */
    public void setOffers(CustomizedOfferList value) {
        this.offers = value;
    }

}

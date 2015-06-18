
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WholesaleServiceProviderAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WholesaleServiceProviderAssignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wholesaleOfferKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceProviderKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WholesaleServiceProviderAssignment", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "wholesaleOfferKey",
    "serviceProviderKey"
})
public class WholesaleServiceProviderAssignment {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String wholesaleOfferKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String serviceProviderKey;

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
     * Gets the value of the serviceProviderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderKey() {
        return serviceProviderKey;
    }

    /**
     * Sets the value of the serviceProviderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderKey(String value) {
        this.serviceProviderKey = value;
    }

}

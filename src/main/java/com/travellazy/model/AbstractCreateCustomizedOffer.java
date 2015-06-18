
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractCreateCustomizedOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCreateCustomizedOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offerFeatures" type="{http://www.travellazy.com/product/model}CreateFeatures" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCreateCustomizedOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offerKey",
    "offerFeatures"
})
@XmlSeeAlso({
    CreateCustomizedBaseOffer.class,
    CreateCustomizedBundleOffer.class
})
public abstract class AbstractCreateCustomizedOffer {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String offerKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateFeatures offerFeatures;

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
     * Gets the value of the offerFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link CreateFeatures }
     *     
     */
    public CreateFeatures getOfferFeatures() {
        return offerFeatures;
    }

    /**
     * Sets the value of the offerFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateFeatures }
     *     
     */
    public void setOfferFeatures(CreateFeatures value) {
        this.offerFeatures = value;
    }

}

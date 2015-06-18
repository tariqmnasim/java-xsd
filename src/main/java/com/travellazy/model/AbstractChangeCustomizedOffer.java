
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractChangeCustomizedOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractChangeCustomizedOffer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerFeatures" type="{http://www.travellazy.com/product/model}AbstractFeatures" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractChangeCustomizedOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "offerFeatures"
})
@XmlSeeAlso({
    ChangeCustomizedBaseOffer.class,
    ChangeCustomizedBundleOffer.class
})
public abstract class AbstractChangeCustomizedOffer {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractFeatures offerFeatures;

    /**
     * Gets the value of the offerFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractFeatures }
     *     
     */
    public AbstractFeatures getOfferFeatures() {
        return offerFeatures;
    }

    /**
     * Sets the value of the offerFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractFeatures }
     *     
     */
    public void setOfferFeatures(AbstractFeatures value) {
        this.offerFeatures = value;
    }

}

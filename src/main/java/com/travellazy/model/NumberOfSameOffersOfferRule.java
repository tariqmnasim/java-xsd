
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOfSameOffersOfferRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfSameOffersOfferRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}OfferRule">
 *       &lt;sequence>
 *         &lt;element name="maxNumberOfSameOffers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfSameOffersOfferRule", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "maxNumberOfSameOffers"
})
public class NumberOfSameOffersOfferRule
    extends OfferRule
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer maxNumberOfSameOffers;

    /**
     * Gets the value of the maxNumberOfSameOffers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfSameOffers() {
        return maxNumberOfSameOffers;
    }

    /**
     * Sets the value of the maxNumberOfSameOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfSameOffers(Integer value) {
        this.maxNumberOfSameOffers = value;
    }

}

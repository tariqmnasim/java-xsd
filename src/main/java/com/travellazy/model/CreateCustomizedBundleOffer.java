
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCustomizedBundleOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCustomizedBundleOffer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCreateCustomizedOffer">
 *       &lt;sequence>
 *         &lt;element name="baseOffers" type="{http://www.travellazy.com/product/model}CreateCustomizedBaseOffers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCustomizedBundleOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "baseOffers"
})
public class CreateCustomizedBundleOffer
    extends AbstractCreateCustomizedOffer
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateCustomizedBaseOffers baseOffers;

    /**
     * Gets the value of the baseOffers property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCustomizedBaseOffers }
     *     
     */
    public CreateCustomizedBaseOffers getBaseOffers() {
        return baseOffers;
    }

    /**
     * Sets the value of the baseOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCustomizedBaseOffers }
     *     
     */
    public void setBaseOffers(CreateCustomizedBaseOffers value) {
        this.baseOffers = value;
    }

}

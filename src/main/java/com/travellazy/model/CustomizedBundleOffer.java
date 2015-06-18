
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizedBundleOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizedBundleOffer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCustomizedOffer">
 *       &lt;sequence>
 *         &lt;element name="customizedBaseOffers" type="{http://www.travellazy.com/product/model}CustomizedBaseOffers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizedBundleOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "customizedBaseOffers"
})
public class CustomizedBundleOffer
    extends AbstractCustomizedOffer
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CustomizedBaseOffers customizedBaseOffers;

    /**
     * Gets the value of the customizedBaseOffers property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizedBaseOffers }
     *     
     */
    public CustomizedBaseOffers getCustomizedBaseOffers() {
        return customizedBaseOffers;
    }

    /**
     * Sets the value of the customizedBaseOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizedBaseOffers }
     *     
     */
    public void setCustomizedBaseOffers(CustomizedBaseOffers value) {
        this.customizedBaseOffers = value;
    }

}

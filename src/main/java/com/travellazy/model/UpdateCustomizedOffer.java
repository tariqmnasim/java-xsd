
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCustomizedOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomizedOffer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}CreateOrder">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.travellazy.com/product/model}OfferAction"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCustomizedOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "action"
})
public class UpdateCustomizedOffer
    extends CreateOrder
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected OfferAction action;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link OfferAction }
     *     
     */
    public OfferAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAction }
     *     
     */
    public void setAction(OfferAction value) {
        this.action = value;
    }

}

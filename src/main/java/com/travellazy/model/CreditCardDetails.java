
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCreditCardDetails">
 *       &lt;sequence>
 *         &lt;element name="cardLastFourDigits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "cardLastFourDigits"
})
public class CreditCardDetails
    extends AbstractCreditCardDetails
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int cardLastFourDigits;

    /**
     * Gets the value of the cardLastFourDigits property.
     * 
     */
    public int getCardLastFourDigits() {
        return cardLastFourDigits;
    }

    /**
     * Sets the value of the cardLastFourDigits property.
     * 
     */
    public void setCardLastFourDigits(int value) {
        this.cardLastFourDigits = value;
    }

}

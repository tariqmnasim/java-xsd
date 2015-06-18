
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardPayment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractPayment">
 *       &lt;sequence>
 *         &lt;element name="creditCard" type="{http://www.travellazy.com/product/model}CreateCreditCardDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardPayment", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "creditCard"
})
public class CreditCardPayment
    extends AbstractPayment
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected CreateCreditCardDetails creditCard;

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCreditCardDetails }
     *     
     */
    public CreateCreditCardDetails getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCreditCardDetails }
     *     
     */
    public void setCreditCard(CreateCreditCardDetails value) {
        this.creditCard = value;
    }

}

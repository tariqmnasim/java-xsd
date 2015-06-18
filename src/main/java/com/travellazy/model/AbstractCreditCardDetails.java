
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractCreditCardDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCreditCardDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardHoldersName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expireMonth">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="expireYear">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1900"/>
 *               &lt;maxInclusive value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCreditCardDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "cardHoldersName",
    "cardTypeKey",
    "expireMonth",
    "expireYear"
})
@XmlSeeAlso({
    CreditCardDetails.class,
    CreateCreditCardDetails.class
})
public class AbstractCreditCardDetails {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String cardHoldersName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String cardTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int expireMonth;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int expireYear;

    /**
     * Gets the value of the cardHoldersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHoldersName() {
        return cardHoldersName;
    }

    /**
     * Sets the value of the cardHoldersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHoldersName(String value) {
        this.cardHoldersName = value;
    }

    /**
     * Gets the value of the cardTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeKey() {
        return cardTypeKey;
    }

    /**
     * Sets the value of the cardTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeKey(String value) {
        this.cardTypeKey = value;
    }

    /**
     * Gets the value of the expireMonth property.
     * 
     */
    public int getExpireMonth() {
        return expireMonth;
    }

    /**
     * Sets the value of the expireMonth property.
     * 
     */
    public void setExpireMonth(int value) {
        this.expireMonth = value;
    }

    /**
     * Gets the value of the expireYear property.
     * 
     */
    public int getExpireYear() {
        return expireYear;
    }

    /**
     * Sets the value of the expireYear property.
     * 
     */
    public void setExpireYear(int value) {
        this.expireYear = value;
    }

}

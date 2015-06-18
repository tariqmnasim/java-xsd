
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreatePaymentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatePaymentDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractPaymentDetails">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="creditCardDetails" type="{http://www.travellazy.com/product/model}CreateCreditCardDetails"/>
 *           &lt;element name="bankDetails" type="{http://www.travellazy.com/product/model}CreateBankDetails"/>
 *           &lt;element name="bankDetailsIban" type="{http://www.travellazy.com/product/model}CreateBankDetailsIban"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatePaymentDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "creditCardDetails",
    "bankDetails",
    "bankDetailsIban"
})
public class CreatePaymentDetails
    extends AbstractPaymentDetails
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateCreditCardDetails creditCardDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateBankDetails bankDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateBankDetailsIban bankDetailsIban;

    /**
     * Gets the value of the creditCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCreditCardDetails }
     *     
     */
    public CreateCreditCardDetails getCreditCardDetails() {
        return creditCardDetails;
    }

    /**
     * Sets the value of the creditCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCreditCardDetails }
     *     
     */
    public void setCreditCardDetails(CreateCreditCardDetails value) {
        this.creditCardDetails = value;
    }

    /**
     * Gets the value of the bankDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateBankDetails }
     *     
     */
    public CreateBankDetails getBankDetails() {
        return bankDetails;
    }

    /**
     * Sets the value of the bankDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateBankDetails }
     *     
     */
    public void setBankDetails(CreateBankDetails value) {
        this.bankDetails = value;
    }

    /**
     * Gets the value of the bankDetailsIban property.
     * 
     * @return
     *     possible object is
     *     {@link CreateBankDetailsIban }
     *     
     */
    public CreateBankDetailsIban getBankDetailsIban() {
        return bankDetailsIban;
    }

    /**
     * Sets the value of the bankDetailsIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateBankDetailsIban }
     *     
     */
    public void setBankDetailsIban(CreateBankDetailsIban value) {
        this.bankDetailsIban = value;
    }

}

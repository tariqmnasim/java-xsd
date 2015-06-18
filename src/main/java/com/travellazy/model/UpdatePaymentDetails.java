
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePaymentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePaymentDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractPaymentDetails">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="creditCardDetails" type="{http://www.travellazy.com/product/model}UpdateCreditCardDetails"/>
 *           &lt;element name="bankDetails" type="{http://www.travellazy.com/product/model}UpdateBankDetails"/>
 *           &lt;element name="bankDetailsIban" type="{http://www.travellazy.com/product/model}UpdateBankDetailsIban"/>
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
@XmlType(name = "UpdatePaymentDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "creditCardDetails",
    "bankDetails",
    "bankDetailsIban"
})
public class UpdatePaymentDetails
    extends AbstractPaymentDetails
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateCreditCardDetails creditCardDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateBankDetails bankDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UpdateBankDetailsIban bankDetailsIban;

    /**
     * Gets the value of the creditCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCreditCardDetails }
     *     
     */
    public UpdateCreditCardDetails getCreditCardDetails() {
        return creditCardDetails;
    }

    /**
     * Sets the value of the creditCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCreditCardDetails }
     *     
     */
    public void setCreditCardDetails(UpdateCreditCardDetails value) {
        this.creditCardDetails = value;
    }

    /**
     * Gets the value of the bankDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateBankDetails }
     *     
     */
    public UpdateBankDetails getBankDetails() {
        return bankDetails;
    }

    /**
     * Sets the value of the bankDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateBankDetails }
     *     
     */
    public void setBankDetails(UpdateBankDetails value) {
        this.bankDetails = value;
    }

    /**
     * Gets the value of the bankDetailsIban property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateBankDetailsIban }
     *     
     */
    public UpdateBankDetailsIban getBankDetailsIban() {
        return bankDetailsIban;
    }

    /**
     * Sets the value of the bankDetailsIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateBankDetailsIban }
     *     
     */
    public void setBankDetailsIban(UpdateBankDetailsIban value) {
        this.bankDetailsIban = value;
    }

}

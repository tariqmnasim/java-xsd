
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetailsInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentMethodKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentParameters" type="{http://www.travellazy.com/product/model}Parameters" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="creditCardDetails" type="{http://www.travellazy.com/product/model}CreditCardDetails"/>
 *           &lt;element name="bankDetails" type="{http://www.travellazy.com/product/model}BankDetails"/>
 *           &lt;element name="bankDetailsIban" type="{http://www.travellazy.com/product/model}BankDetailsIban"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsInformation", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "paymentMethodKey",
    "paymentTypeKey",
    "paymentParameters",
    "creditCardDetails",
    "bankDetails",
    "bankDetailsIban"
})
@XmlSeeAlso({
    PendingPaymentDetailsInformation.class
})
public class PaymentDetailsInformation {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String paymentMethodKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String paymentTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Parameters paymentParameters;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreditCardDetails creditCardDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BankDetails bankDetails;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BankDetailsIban bankDetailsIban;

    /**
     * Gets the value of the paymentMethodKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodKey() {
        return paymentMethodKey;
    }

    /**
     * Sets the value of the paymentMethodKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodKey(String value) {
        this.paymentMethodKey = value;
    }

    /**
     * Gets the value of the paymentTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeKey() {
        return paymentTypeKey;
    }

    /**
     * Sets the value of the paymentTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeKey(String value) {
        this.paymentTypeKey = value;
    }

    /**
     * Gets the value of the paymentParameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getPaymentParameters() {
        return paymentParameters;
    }

    /**
     * Sets the value of the paymentParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setPaymentParameters(Parameters value) {
        this.paymentParameters = value;
    }

    /**
     * Gets the value of the creditCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDetails }
     *     
     */
    public CreditCardDetails getCreditCardDetails() {
        return creditCardDetails;
    }

    /**
     * Sets the value of the creditCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDetails }
     *     
     */
    public void setCreditCardDetails(CreditCardDetails value) {
        this.creditCardDetails = value;
    }

    /**
     * Gets the value of the bankDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BankDetails }
     *     
     */
    public BankDetails getBankDetails() {
        return bankDetails;
    }

    /**
     * Sets the value of the bankDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankDetails }
     *     
     */
    public void setBankDetails(BankDetails value) {
        this.bankDetails = value;
    }

    /**
     * Gets the value of the bankDetailsIban property.
     * 
     * @return
     *     possible object is
     *     {@link BankDetailsIban }
     *     
     */
    public BankDetailsIban getBankDetailsIban() {
        return bankDetailsIban;
    }

    /**
     * Sets the value of the bankDetailsIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankDetailsIban }
     *     
     */
    public void setBankDetailsIban(BankDetailsIban value) {
        this.bankDetailsIban = value;
    }

}

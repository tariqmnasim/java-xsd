
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractBankDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractBankDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractBankDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "accountHolderName",
    "bankIdentificationCode",
    "bankAccountNumber"
})
@XmlSeeAlso({
    BankDetails.class,
    CreateBankDetails.class,
    UpdateBankDetails.class
})
public abstract class AbstractBankDetails {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String accountHolderName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String bankIdentificationCode;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String bankAccountNumber;

    /**
     * Gets the value of the accountHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the value of the accountHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderName(String value) {
        this.accountHolderName = value;
    }

    /**
     * Gets the value of the bankIdentificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankIdentificationCode() {
        return bankIdentificationCode;
    }

    /**
     * Sets the value of the bankIdentificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankIdentificationCode(String value) {
        this.bankIdentificationCode = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

}


package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbstractBankDetailsIban complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractBankDetailsIban">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iban" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractBankDetailsIban", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "accountHolderName",
    "bankIdentificationCode",
    "iban",
    "signatureDate"
})
@XmlSeeAlso({
    CreateBankDetailsIban.class,
    UpdateBankDetailsIban.class,
    BankDetailsIban.class
})
public abstract class AbstractBankDetailsIban {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String accountHolderName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String bankIdentificationCode;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String iban;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signatureDate;

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
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the signatureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignatureDate() {
        return signatureDate;
    }

    /**
     * Sets the value of the signatureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignatureDate(XMLGregorianCalendar value) {
        this.signatureDate = value;
    }

}

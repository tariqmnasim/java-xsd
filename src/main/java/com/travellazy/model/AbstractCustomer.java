
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbstractCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusKey" type="{http://www.travellazy.com/product/model}StatusType" minOccurs="0"/>
 *         &lt;element name="activationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="parentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="legacyAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overdueBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceCurrency" type="{http://www.travellazy.com/product/model}isoCurrency" minOccurs="0"/>
 *         &lt;element name="additionalDetails" type="{http://www.travellazy.com/product/model}AdditionalDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCustomer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "statusKey",
    "activationDate",
    "lastModified",
    "parentCustomerId",
    "legacyAccountNumber",
    "overdueBalance",
    "accountBalance",
    "accountBalanceCurrency",
    "additionalDetails"
})
@XmlSeeAlso({
    Customer.class,
    Tenant.class,
    BusinessCustomer.class,
    ResidentialCustomer.class
})
public abstract class AbstractCustomer {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected StatusType statusKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationDate;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long parentCustomerId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String legacyAccountNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String overdueBalance;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String accountBalance;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String accountBalanceCurrency;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AdditionalDetails additionalDetails;

    /**
     * Gets the value of the statusKey property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatusKey() {
        return statusKey;
    }

    /**
     * Sets the value of the statusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatusKey(StatusType value) {
        this.statusKey = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the parentCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentCustomerId() {
        return parentCustomerId;
    }

    /**
     * Sets the value of the parentCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentCustomerId(Long value) {
        this.parentCustomerId = value;
    }

    /**
     * Gets the value of the legacyAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyAccountNumber() {
        return legacyAccountNumber;
    }

    /**
     * Sets the value of the legacyAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyAccountNumber(String value) {
        this.legacyAccountNumber = value;
    }

    /**
     * Gets the value of the overdueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueBalance() {
        return overdueBalance;
    }

    /**
     * Sets the value of the overdueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueBalance(String value) {
        this.overdueBalance = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalance(String value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the accountBalanceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceCurrency() {
        return accountBalanceCurrency;
    }

    /**
     * Sets the value of the accountBalanceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceCurrency(String value) {
        this.accountBalanceCurrency = value;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDetails }
     *     
     */
    public AdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDetails }
     *     
     */
    public void setAdditionalDetails(AdditionalDetails value) {
        this.additionalDetails = value;
    }

}

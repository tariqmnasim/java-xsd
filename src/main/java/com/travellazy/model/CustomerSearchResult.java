
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="customerTitleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStatusKey" type="{http://www.travellazy.com/product/model}StatusType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.travellazy.com/product/model}Address" minOccurs="0"/>
 *         &lt;element name="customizedOffers" type="{http://www.travellazy.com/product/model}CustomizedOfferSearchResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSearchResult", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "customerId",
    "customerTitleKey",
    "firstName",
    "lastName",
    "middleName",
    "businessName",
    "accountStatusKey",
    "address",
    "customizedOffers"
})
public class CustomerSearchResult {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long customerId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String customerTitleKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String firstName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String lastName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String middleName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String businessName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected StatusType accountStatusKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Address address;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CustomizedOfferSearchResults customizedOffers;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerTitleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTitleKey() {
        return customerTitleKey;
    }

    /**
     * Sets the value of the customerTitleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTitleKey(String value) {
        this.customerTitleKey = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the accountStatusKey property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getAccountStatusKey() {
        return accountStatusKey;
    }

    /**
     * Sets the value of the accountStatusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setAccountStatusKey(StatusType value) {
        this.accountStatusKey = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the customizedOffers property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizedOfferSearchResults }
     *     
     */
    public CustomizedOfferSearchResults getCustomizedOffers() {
        return customizedOffers;
    }

    /**
     * Sets the value of the customizedOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizedOfferSearchResults }
     *     
     */
    public void setCustomizedOffers(CustomizedOfferSearchResults value) {
        this.customizedOffers = value;
    }

}

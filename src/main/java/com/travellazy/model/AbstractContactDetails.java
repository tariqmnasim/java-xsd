
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractContactDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumberDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumberEvening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredContactMethodKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredContactLanguageKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AbstractContactDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "email",
    "phoneNumberDay",
    "phoneNumberEvening",
    "mobile",
    "fax",
    "preferredContactMethodKey",
    "preferredContactLanguageKey",
    "additionalDetails"
})
@XmlSeeAlso({
    ContactDetails.class,
    CreateContactDetails.class
})
public abstract class AbstractContactDetails {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String email;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String phoneNumberDay;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String phoneNumberEvening;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String mobile;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String fax;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String preferredContactMethodKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String preferredContactLanguageKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AdditionalDetails additionalDetails;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phoneNumberDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberDay() {
        return phoneNumberDay;
    }

    /**
     * Sets the value of the phoneNumberDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberDay(String value) {
        this.phoneNumberDay = value;
    }

    /**
     * Gets the value of the phoneNumberEvening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberEvening() {
        return phoneNumberEvening;
    }

    /**
     * Sets the value of the phoneNumberEvening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberEvening(String value) {
        this.phoneNumberEvening = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the preferredContactMethodKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredContactMethodKey() {
        return preferredContactMethodKey;
    }

    /**
     * Sets the value of the preferredContactMethodKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredContactMethodKey(String value) {
        this.preferredContactMethodKey = value;
    }

    /**
     * Gets the value of the preferredContactLanguageKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredContactLanguageKey() {
        return preferredContactLanguageKey;
    }

    /**
     * Sets the value of the preferredContactLanguageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredContactLanguageKey(String value) {
        this.preferredContactLanguageKey = value;
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

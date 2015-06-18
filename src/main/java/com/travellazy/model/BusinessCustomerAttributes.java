
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusinessCustomerAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessCustomerAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactCustomerTitleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactPreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactDayOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commercialRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://www.travellazy.com/product/model}Parameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessCustomerAttributes", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "entityTypeKey",
    "contactCustomerTitleKey",
    "contactFirstName",
    "contactMiddleName",
    "contactLastName",
    "contactPreferredName",
    "contactDayOfBirth",
    "businessName",
    "legalName",
    "commercialRegistrationNumber",
    "industryTypeKey",
    "parameters"
})
public class BusinessCustomerAttributes {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String entityTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String contactCustomerTitleKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String contactFirstName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String contactMiddleName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String contactLastName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String contactPreferredName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contactDayOfBirth;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String businessName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String legalName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String commercialRegistrationNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String industryTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Parameters parameters;

    /**
     * Gets the value of the entityTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityTypeKey() {
        return entityTypeKey;
    }

    /**
     * Sets the value of the entityTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityTypeKey(String value) {
        this.entityTypeKey = value;
    }

    /**
     * Gets the value of the contactCustomerTitleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactCustomerTitleKey() {
        return contactCustomerTitleKey;
    }

    /**
     * Sets the value of the contactCustomerTitleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactCustomerTitleKey(String value) {
        this.contactCustomerTitleKey = value;
    }

    /**
     * Gets the value of the contactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Sets the value of the contactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstName(String value) {
        this.contactFirstName = value;
    }

    /**
     * Gets the value of the contactMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMiddleName() {
        return contactMiddleName;
    }

    /**
     * Sets the value of the contactMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMiddleName(String value) {
        this.contactMiddleName = value;
    }

    /**
     * Gets the value of the contactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * Sets the value of the contactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    /**
     * Gets the value of the contactPreferredName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPreferredName() {
        return contactPreferredName;
    }

    /**
     * Sets the value of the contactPreferredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPreferredName(String value) {
        this.contactPreferredName = value;
    }

    /**
     * Gets the value of the contactDayOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContactDayOfBirth() {
        return contactDayOfBirth;
    }

    /**
     * Sets the value of the contactDayOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContactDayOfBirth(XMLGregorianCalendar value) {
        this.contactDayOfBirth = value;
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
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the commercialRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialRegistrationNumber() {
        return commercialRegistrationNumber;
    }

    /**
     * Sets the value of the commercialRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialRegistrationNumber(String value) {
        this.commercialRegistrationNumber = value;
    }

    /**
     * Gets the value of the industryTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryTypeKey() {
        return industryTypeKey;
    }

    /**
     * Sets the value of the industryTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryTypeKey(String value) {
        this.industryTypeKey = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
    }

}

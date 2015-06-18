
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractCreditCheckDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCreditCheckDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificationTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residentialStatusKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residentialStatusKeyPreviousAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.travellazy.com/product/model}GenderType" minOccurs="0"/>
 *         &lt;element name="countryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employmentStatusKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreesToCreditCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timeAtCurrentAddressKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeAtPreviousAddressKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardNumbersKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeInCurrentJobKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialCreditDecisionType" type="{http://www.travellazy.com/product/model}CreditDecisionType" minOccurs="0"/>
 *         &lt;element name="riskGrade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCreditCheckDetails", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "identificationTypeKey",
    "identificationNumber",
    "residentialStatusKey",
    "residentialStatusKeyPreviousAddress",
    "gender",
    "countryOfResidence",
    "employmentStatusKey",
    "employerName",
    "agreesToCreditCheck",
    "timeAtCurrentAddressKey",
    "timeAtPreviousAddressKey",
    "creditCardNumbersKey",
    "timeInCurrentJobKey",
    "initialCreditDecisionType",
    "riskGrade"
})
@XmlSeeAlso({
    CreateCreditCheckDetails.class
})
public abstract class AbstractCreditCheckDetails {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String identificationTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String identificationNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String residentialStatusKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String residentialStatusKeyPreviousAddress;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected GenderType gender;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String countryOfResidence;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String employmentStatusKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String employerName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean agreesToCreditCheck;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String timeAtCurrentAddressKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String timeAtPreviousAddressKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String creditCardNumbersKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String timeInCurrentJobKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreditDecisionType initialCreditDecisionType;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer riskGrade;

    /**
     * Gets the value of the identificationTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationTypeKey() {
        return identificationTypeKey;
    }

    /**
     * Sets the value of the identificationTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationTypeKey(String value) {
        this.identificationTypeKey = value;
    }

    /**
     * Gets the value of the identificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Sets the value of the identificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNumber(String value) {
        this.identificationNumber = value;
    }

    /**
     * Gets the value of the residentialStatusKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialStatusKey() {
        return residentialStatusKey;
    }

    /**
     * Sets the value of the residentialStatusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialStatusKey(String value) {
        this.residentialStatusKey = value;
    }

    /**
     * Gets the value of the residentialStatusKeyPreviousAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialStatusKeyPreviousAddress() {
        return residentialStatusKeyPreviousAddress;
    }

    /**
     * Sets the value of the residentialStatusKeyPreviousAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentialStatusKeyPreviousAddress(String value) {
        this.residentialStatusKeyPreviousAddress = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

    /**
     * Gets the value of the employmentStatusKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentStatusKey() {
        return employmentStatusKey;
    }

    /**
     * Sets the value of the employmentStatusKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentStatusKey(String value) {
        this.employmentStatusKey = value;
    }

    /**
     * Gets the value of the employerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * Sets the value of the employerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerName(String value) {
        this.employerName = value;
    }

    /**
     * Gets the value of the agreesToCreditCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgreesToCreditCheck() {
        return agreesToCreditCheck;
    }

    /**
     * Sets the value of the agreesToCreditCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgreesToCreditCheck(Boolean value) {
        this.agreesToCreditCheck = value;
    }

    /**
     * Gets the value of the timeAtCurrentAddressKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAtCurrentAddressKey() {
        return timeAtCurrentAddressKey;
    }

    /**
     * Sets the value of the timeAtCurrentAddressKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAtCurrentAddressKey(String value) {
        this.timeAtCurrentAddressKey = value;
    }

    /**
     * Gets the value of the timeAtPreviousAddressKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAtPreviousAddressKey() {
        return timeAtPreviousAddressKey;
    }

    /**
     * Sets the value of the timeAtPreviousAddressKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAtPreviousAddressKey(String value) {
        this.timeAtPreviousAddressKey = value;
    }

    /**
     * Gets the value of the creditCardNumbersKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumbersKey() {
        return creditCardNumbersKey;
    }

    /**
     * Sets the value of the creditCardNumbersKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumbersKey(String value) {
        this.creditCardNumbersKey = value;
    }

    /**
     * Gets the value of the timeInCurrentJobKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeInCurrentJobKey() {
        return timeInCurrentJobKey;
    }

    /**
     * Sets the value of the timeInCurrentJobKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeInCurrentJobKey(String value) {
        this.timeInCurrentJobKey = value;
    }

    /**
     * Gets the value of the initialCreditDecisionType property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDecisionType }
     *     
     */
    public CreditDecisionType getInitialCreditDecisionType() {
        return initialCreditDecisionType;
    }

    /**
     * Sets the value of the initialCreditDecisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDecisionType }
     *     
     */
    public void setInitialCreditDecisionType(CreditDecisionType value) {
        this.initialCreditDecisionType = value;
    }

    /**
     * Gets the value of the riskGrade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRiskGrade() {
        return riskGrade;
    }

    /**
     * Sets the value of the riskGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRiskGrade(Integer value) {
        this.riskGrade = value;
    }

}

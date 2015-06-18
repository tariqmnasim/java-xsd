
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalDeliveryTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partPostalNumberPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partPostalNumberPostfix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partPostalNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="flatUnitTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floorLevelTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partUnitNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="partUnitNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNumber1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="streetNumber1Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNumber2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="streetNumber2Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetSuffixKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customField4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="referenceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAddress", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "city",
    "zipCode",
    "streetName",
    "countryKey",
    "propertyName",
    "postalDeliveryTypeKey",
    "partPostalNumberPrefix",
    "partPostalNumberPostfix",
    "partPostalNumber",
    "flatUnitTypeKey",
    "floorLevelTypeKey",
    "partUnitNumber",
    "partUnitNumberSuffix",
    "levelNumber",
    "streetNumber1",
    "streetNumber1Suffix",
    "streetNumber2",
    "streetNumber2Suffix",
    "streetTypeKey",
    "streetSuffixKey",
    "stateKey",
    "customField1",
    "customField2",
    "customField3",
    "customField4",
    "referenceId",
    "referenceSystem",
    "validated"
})
@XmlSeeAlso({
    CreateAddress.class,
    UpdateAddress.class,
    Address.class,
    ServiceProviderAddress.class
})
public abstract class AbstractAddress {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String city;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String zipCode;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String streetName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String countryKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String propertyName;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String postalDeliveryTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String partPostalNumberPrefix;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String partPostalNumberPostfix;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long partPostalNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String flatUnitTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String floorLevelTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer partUnitNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String partUnitNumberSuffix;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String levelNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer streetNumber1;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String streetNumber1Suffix;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer streetNumber2;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String streetNumber2Suffix;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String streetTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String streetSuffixKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String stateKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String customField1;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String customField2;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String customField3;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String customField4;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long referenceId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String referenceSystem;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Boolean validated;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the countryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryKey() {
        return countryKey;
    }

    /**
     * Sets the value of the countryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryKey(String value) {
        this.countryKey = value;
    }

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the postalDeliveryTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalDeliveryTypeKey() {
        return postalDeliveryTypeKey;
    }

    /**
     * Sets the value of the postalDeliveryTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalDeliveryTypeKey(String value) {
        this.postalDeliveryTypeKey = value;
    }

    /**
     * Gets the value of the partPostalNumberPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartPostalNumberPrefix() {
        return partPostalNumberPrefix;
    }

    /**
     * Sets the value of the partPostalNumberPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartPostalNumberPrefix(String value) {
        this.partPostalNumberPrefix = value;
    }

    /**
     * Gets the value of the partPostalNumberPostfix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartPostalNumberPostfix() {
        return partPostalNumberPostfix;
    }

    /**
     * Sets the value of the partPostalNumberPostfix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartPostalNumberPostfix(String value) {
        this.partPostalNumberPostfix = value;
    }

    /**
     * Gets the value of the partPostalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartPostalNumber() {
        return partPostalNumber;
    }

    /**
     * Sets the value of the partPostalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartPostalNumber(Long value) {
        this.partPostalNumber = value;
    }

    /**
     * Gets the value of the flatUnitTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatUnitTypeKey() {
        return flatUnitTypeKey;
    }

    /**
     * Sets the value of the flatUnitTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatUnitTypeKey(String value) {
        this.flatUnitTypeKey = value;
    }

    /**
     * Gets the value of the floorLevelTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorLevelTypeKey() {
        return floorLevelTypeKey;
    }

    /**
     * Sets the value of the floorLevelTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorLevelTypeKey(String value) {
        this.floorLevelTypeKey = value;
    }

    /**
     * Gets the value of the partUnitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartUnitNumber() {
        return partUnitNumber;
    }

    /**
     * Sets the value of the partUnitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartUnitNumber(Integer value) {
        this.partUnitNumber = value;
    }

    /**
     * Gets the value of the partUnitNumberSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartUnitNumberSuffix() {
        return partUnitNumberSuffix;
    }

    /**
     * Sets the value of the partUnitNumberSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartUnitNumberSuffix(String value) {
        this.partUnitNumberSuffix = value;
    }

    /**
     * Gets the value of the levelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelNumber() {
        return levelNumber;
    }

    /**
     * Sets the value of the levelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelNumber(String value) {
        this.levelNumber = value;
    }

    /**
     * Gets the value of the streetNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStreetNumber1() {
        return streetNumber1;
    }

    /**
     * Sets the value of the streetNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStreetNumber1(Integer value) {
        this.streetNumber1 = value;
    }

    /**
     * Gets the value of the streetNumber1Suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber1Suffix() {
        return streetNumber1Suffix;
    }

    /**
     * Sets the value of the streetNumber1Suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber1Suffix(String value) {
        this.streetNumber1Suffix = value;
    }

    /**
     * Gets the value of the streetNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStreetNumber2() {
        return streetNumber2;
    }

    /**
     * Sets the value of the streetNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStreetNumber2(Integer value) {
        this.streetNumber2 = value;
    }

    /**
     * Gets the value of the streetNumber2Suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber2Suffix() {
        return streetNumber2Suffix;
    }

    /**
     * Sets the value of the streetNumber2Suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber2Suffix(String value) {
        this.streetNumber2Suffix = value;
    }

    /**
     * Gets the value of the streetTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetTypeKey() {
        return streetTypeKey;
    }

    /**
     * Sets the value of the streetTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetTypeKey(String value) {
        this.streetTypeKey = value;
    }

    /**
     * Gets the value of the streetSuffixKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetSuffixKey() {
        return streetSuffixKey;
    }

    /**
     * Sets the value of the streetSuffixKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetSuffixKey(String value) {
        this.streetSuffixKey = value;
    }

    /**
     * Gets the value of the stateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateKey() {
        return stateKey;
    }

    /**
     * Sets the value of the stateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateKey(String value) {
        this.stateKey = value;
    }

    /**
     * Gets the value of the customField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField1() {
        return customField1;
    }

    /**
     * Sets the value of the customField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField1(String value) {
        this.customField1 = value;
    }

    /**
     * Gets the value of the customField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField2() {
        return customField2;
    }

    /**
     * Sets the value of the customField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField2(String value) {
        this.customField2 = value;
    }

    /**
     * Gets the value of the customField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField3() {
        return customField3;
    }

    /**
     * Sets the value of the customField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField3(String value) {
        this.customField3 = value;
    }

    /**
     * Gets the value of the customField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomField4() {
        return customField4;
    }

    /**
     * Sets the value of the customField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomField4(String value) {
        this.customField4 = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferenceId(Long value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the referenceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceSystem() {
        return referenceSystem;
    }

    /**
     * Sets the value of the referenceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceSystem(String value) {
        this.referenceSystem = value;
    }

    /**
     * Gets the value of the validated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidated() {
        return validated;
    }

    /**
     * Sets the value of the validated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidated(Boolean value) {
        this.validated = value;
    }

}

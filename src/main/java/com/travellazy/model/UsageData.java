
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UsageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mediationEventKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mediationFeedKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="providerPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="uniqueExternalIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalAttributes" type="{http://www.travellazy.com/product/model}AdditionalUsageAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageData", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceIdentifier",
    "mediationEventKey",
    "mediationFeedKey",
    "eventTimestamp",
    "dataType",
    "providerPrice",
    "uniqueExternalIdentifier",
    "additionalAttributes"
})
@XmlSeeAlso({
    VolumeBasedUsageData.class,
    TimeBasedUsageData.class,
    EventBasedUsageData.class
})
public abstract class UsageData {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String serviceIdentifier;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String mediationEventKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String mediationFeedKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTimestamp;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String dataType;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Float providerPrice;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String uniqueExternalIdentifier;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AdditionalUsageAttributes additionalAttributes;

    /**
     * Gets the value of the serviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the value of the serviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentifier(String value) {
        this.serviceIdentifier = value;
    }

    /**
     * Gets the value of the mediationEventKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediationEventKey() {
        return mediationEventKey;
    }

    /**
     * Sets the value of the mediationEventKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediationEventKey(String value) {
        this.mediationEventKey = value;
    }

    /**
     * Gets the value of the mediationFeedKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediationFeedKey() {
        return mediationFeedKey;
    }

    /**
     * Sets the value of the mediationFeedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediationFeedKey(String value) {
        this.mediationFeedKey = value;
    }

    /**
     * Gets the value of the eventTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTimestamp() {
        return eventTimestamp;
    }

    /**
     * Sets the value of the eventTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTimestamp(XMLGregorianCalendar value) {
        this.eventTimestamp = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the providerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProviderPrice() {
        return providerPrice;
    }

    /**
     * Sets the value of the providerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProviderPrice(Float value) {
        this.providerPrice = value;
    }

    /**
     * Gets the value of the uniqueExternalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueExternalIdentifier() {
        return uniqueExternalIdentifier;
    }

    /**
     * Sets the value of the uniqueExternalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueExternalIdentifier(String value) {
        this.uniqueExternalIdentifier = value;
    }

    /**
     * Gets the value of the additionalAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalUsageAttributes }
     *     
     */
    public AdditionalUsageAttributes getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * Sets the value of the additionalAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalUsageAttributes }
     *     
     */
    public void setAdditionalAttributes(AdditionalUsageAttributes value) {
        this.additionalAttributes = value;
    }

}

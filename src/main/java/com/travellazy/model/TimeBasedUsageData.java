
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}UsageData">
 *       &lt;sequence>
 *         &lt;element name="originatingCountryCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="originatingNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="destinationCountryCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="destinationNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="destinationInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "originatingCountryCode",
    "originatingNumber",
    "destinationCountryCode",
    "destinationNumber",
    "destinationInfo",
    "duration"
})
@XmlRootElement(name = "timeBasedUsageData", namespace = "http://www.travellazy.com/product/model")
public class TimeBasedUsageData
    extends UsageData
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer originatingCountryCode;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long originatingNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Integer destinationCountryCode;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long destinationNumber;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String destinationInfo;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int duration;

    /**
     * Gets the value of the originatingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginatingCountryCode() {
        return originatingCountryCode;
    }

    /**
     * Sets the value of the originatingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginatingCountryCode(Integer value) {
        this.originatingCountryCode = value;
    }

    /**
     * Gets the value of the originatingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginatingNumber() {
        return originatingNumber;
    }

    /**
     * Sets the value of the originatingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginatingNumber(Long value) {
        this.originatingNumber = value;
    }

    /**
     * Gets the value of the destinationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * Sets the value of the destinationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationCountryCode(Integer value) {
        this.destinationCountryCode = value;
    }

    /**
     * Gets the value of the destinationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestinationNumber() {
        return destinationNumber;
    }

    /**
     * Sets the value of the destinationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestinationNumber(Long value) {
        this.destinationNumber = value;
    }

    /**
     * Gets the value of the destinationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationInfo() {
        return destinationInfo;
    }

    /**
     * Sets the value of the destinationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationInfo(String value) {
        this.destinationInfo = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(int value) {
        this.duration = value;
    }

}

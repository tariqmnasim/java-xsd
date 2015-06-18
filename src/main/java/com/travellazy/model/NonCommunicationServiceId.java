
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonCommunicationServiceId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonCommunicationServiceId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceProviderKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nonCommunicationServiceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonCommunicationServiceId", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceProviderKey",
    "nonCommunicationServiceKey"
})
public class NonCommunicationServiceId {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String serviceProviderKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String nonCommunicationServiceKey;

    /**
     * Gets the value of the serviceProviderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderKey() {
        return serviceProviderKey;
    }

    /**
     * Sets the value of the serviceProviderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderKey(String value) {
        this.serviceProviderKey = value;
    }

    /**
     * Gets the value of the nonCommunicationServiceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonCommunicationServiceKey() {
        return nonCommunicationServiceKey;
    }

    /**
     * Sets the value of the nonCommunicationServiceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonCommunicationServiceKey(String value) {
        this.nonCommunicationServiceKey = value;
    }

}


package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpgradeCustomizedBundleMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeCustomizedBundleMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetOfferKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="sourceOfferKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="sourceOfferId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;/choice>
 *         &lt;element name="offerGroupKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerFeatures" type="{http://www.travellazy.com/product/model}AbstractFeatures" minOccurs="0"/>
 *         &lt;element name="serviceFeatures" type="{http://www.travellazy.com/product/model}AbstractFeatures" minOccurs="0"/>
 *         &lt;element name="services" type="{http://www.travellazy.com/product/model}AbstractServices" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeCustomizedBundleMember", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "targetOfferKey",
    "sourceOfferKey",
    "sourceOfferId",
    "offerGroupKey",
    "offerFeatures",
    "serviceFeatures",
    "services"
})
public class UpgradeCustomizedBundleMember {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String targetOfferKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String sourceOfferKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long sourceOfferId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String offerGroupKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractFeatures offerFeatures;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractFeatures serviceFeatures;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractServices services;

    /**
     * Gets the value of the targetOfferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetOfferKey() {
        return targetOfferKey;
    }

    /**
     * Sets the value of the targetOfferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetOfferKey(String value) {
        this.targetOfferKey = value;
    }

    /**
     * Gets the value of the sourceOfferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfferKey() {
        return sourceOfferKey;
    }

    /**
     * Sets the value of the sourceOfferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfferKey(String value) {
        this.sourceOfferKey = value;
    }

    /**
     * Gets the value of the sourceOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceOfferId() {
        return sourceOfferId;
    }

    /**
     * Sets the value of the sourceOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceOfferId(Long value) {
        this.sourceOfferId = value;
    }

    /**
     * Gets the value of the offerGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferGroupKey() {
        return offerGroupKey;
    }

    /**
     * Sets the value of the offerGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferGroupKey(String value) {
        this.offerGroupKey = value;
    }

    /**
     * Gets the value of the offerFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractFeatures }
     *     
     */
    public AbstractFeatures getOfferFeatures() {
        return offerFeatures;
    }

    /**
     * Sets the value of the offerFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractFeatures }
     *     
     */
    public void setOfferFeatures(AbstractFeatures value) {
        this.offerFeatures = value;
    }

    /**
     * Gets the value of the serviceFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractFeatures }
     *     
     */
    public AbstractFeatures getServiceFeatures() {
        return serviceFeatures;
    }

    /**
     * Sets the value of the serviceFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractFeatures }
     *     
     */
    public void setServiceFeatures(AbstractFeatures value) {
        this.serviceFeatures = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractServices }
     *     
     */
    public AbstractServices getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractServices }
     *     
     */
    public void setServices(AbstractServices value) {
        this.services = value;
    }

}

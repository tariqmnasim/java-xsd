
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCustomizedBaseOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCustomizedBaseOffer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractCreateCustomizedOffer">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="services" type="{http://www.travellazy.com/product/model}CreateServices"/>
 *           &lt;element name="serviceFeatures" type="{http://www.travellazy.com/product/model}CreateFeatures"/>
 *         &lt;/choice>
 *         &lt;element name="offerGroupKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCustomizedBaseOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "services",
    "serviceFeatures",
    "offerGroupKey"
})
@XmlSeeAlso({
    RetrieveOfferConfiguration.class
})
public class CreateCustomizedBaseOffer
    extends AbstractCreateCustomizedOffer
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateServices services;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateFeatures serviceFeatures;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String offerGroupKey;

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link CreateServices }
     *     
     */
    public CreateServices getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateServices }
     *     
     */
    public void setServices(CreateServices value) {
        this.services = value;
    }

    /**
     * Gets the value of the serviceFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link CreateFeatures }
     *     
     */
    public CreateFeatures getServiceFeatures() {
        return serviceFeatures;
    }

    /**
     * Sets the value of the serviceFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateFeatures }
     *     
     */
    public void setServiceFeatures(CreateFeatures value) {
        this.serviceFeatures = value;
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

}


package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractService">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="serviceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="serviceId" type="{http://www.travellazy.com/product/model}nonNegativeLong"/>
 *         &lt;/choice>
 *         &lt;element name="serviceFeatures" type="{http://www.travellazy.com/product/model}AbstractFeatures" minOccurs="0"/>
 *         &lt;element name="subServices" type="{http://www.travellazy.com/product/model}AbstractServices" minOccurs="0"/>
 *         &lt;element name="serviceUsages" type="{http://www.travellazy.com/product/model}UsageAdjustments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateService", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceKey",
    "serviceId",
    "serviceFeatures",
    "subServices",
    "serviceUsages"
})
public class UpdateService
    extends AbstractService
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String serviceKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long serviceId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractFeatures serviceFeatures;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractServices subServices;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected UsageAdjustments serviceUsages;

    /**
     * Gets the value of the serviceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceKey() {
        return serviceKey;
    }

    /**
     * Sets the value of the serviceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceKey(String value) {
        this.serviceKey = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceId(Long value) {
        this.serviceId = value;
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
     * Gets the value of the subServices property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractServices }
     *     
     */
    public AbstractServices getSubServices() {
        return subServices;
    }

    /**
     * Sets the value of the subServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractServices }
     *     
     */
    public void setSubServices(AbstractServices value) {
        this.subServices = value;
    }

    /**
     * Gets the value of the serviceUsages property.
     * 
     * @return
     *     possible object is
     *     {@link UsageAdjustments }
     *     
     */
    public UsageAdjustments getServiceUsages() {
        return serviceUsages;
    }

    /**
     * Sets the value of the serviceUsages property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageAdjustments }
     *     
     */
    public void setServiceUsages(UsageAdjustments value) {
        this.serviceUsages = value;
    }

}

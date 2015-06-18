
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractService">
 *       &lt;sequence>
 *         &lt;element name="serviceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceFeatures" type="{http://www.travellazy.com/product/model}CreateFeatures" minOccurs="0"/>
 *         &lt;element name="subServices" type="{http://www.travellazy.com/product/model}CreateServices" minOccurs="0"/>
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
@XmlType(name = "CreateService", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceKey",
    "serviceFeatures",
    "subServices",
    "serviceUsages"
})
public class CreateService
    extends AbstractService
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String serviceKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateFeatures serviceFeatures;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected CreateServices subServices;
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
     * Gets the value of the subServices property.
     * 
     * @return
     *     possible object is
     *     {@link CreateServices }
     *     
     */
    public CreateServices getSubServices() {
        return subServices;
    }

    /**
     * Sets the value of the subServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateServices }
     *     
     */
    public void setSubServices(CreateServices value) {
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

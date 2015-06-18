
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeCustomizedBaseOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCustomizedBaseOffer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractChangeCustomizedOffer">
 *       &lt;sequence>
 *         &lt;element name="serviceFeatures" type="{http://www.travellazy.com/product/model}AbstractFeatures" minOccurs="0"/>
 *         &lt;element name="services" type="{http://www.travellazy.com/product/model}AbstractServices" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeCustomizedBaseOffer", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceFeatures",
    "services"
})
public class ChangeCustomizedBaseOffer
    extends AbstractChangeCustomizedOffer
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractFeatures serviceFeatures;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractServices services;

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

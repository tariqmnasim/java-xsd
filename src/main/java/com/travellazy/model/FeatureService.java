
package com.travellazy.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceId" type="{http://www.travellazy.com/product/model}nonNegativeLong"/>
 *         &lt;element name="feature" type="{http://www.travellazy.com/product/model}Feature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="services" type="{http://www.travellazy.com/product/model}FeatureServices" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureService", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceKey",
    "serviceId",
    "feature",
    "services"
})
public class FeatureService {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String serviceKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long serviceId;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected List<Feature> feature;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected FeatureServices services;

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
     */
    public long getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     */
    public void setServiceId(long value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feature }
     * 
     * 
     */
    public List<Feature> getFeature() {
        if (feature == null) {
            feature = new ArrayList<Feature>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureServices }
     *     
     */
    public FeatureServices getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureServices }
     *     
     */
    public void setServices(FeatureServices value) {
        this.services = value;
    }

}

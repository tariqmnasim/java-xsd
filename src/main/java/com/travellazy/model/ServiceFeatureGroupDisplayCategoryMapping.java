
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFeatureGroupDisplayCategoryMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFeatureGroupDisplayCategoryMapping">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}FeatureGroupDisplayCategoryMapping">
 *       &lt;sequence>
 *         &lt;element name="serviceProviderKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeatureGroupDisplayCategoryMapping", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "serviceProviderKey"
})
public class ServiceFeatureGroupDisplayCategoryMapping
    extends FeatureGroupDisplayCategoryMapping
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String serviceProviderKey;

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

}

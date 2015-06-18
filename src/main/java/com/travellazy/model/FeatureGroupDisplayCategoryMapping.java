
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureGroupDisplayCategoryMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureGroupDisplayCategoryMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="featureGroupKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureGroupDisplayCategoryMapping", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "featureGroupKey",
    "categoryKey"
})
@XmlSeeAlso({
    ServiceFeatureGroupDisplayCategoryMapping.class
})
public class FeatureGroupDisplayCategoryMapping {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String featureGroupKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String categoryKey;

    /**
     * Gets the value of the featureGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureGroupKey() {
        return featureGroupKey;
    }

    /**
     * Sets the value of the featureGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureGroupKey(String value) {
        this.featureGroupKey = value;
    }

    /**
     * Gets the value of the categoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryKey() {
        return categoryKey;
    }

    /**
     * Sets the value of the categoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryKey(String value) {
        this.categoryKey = value;
    }

}

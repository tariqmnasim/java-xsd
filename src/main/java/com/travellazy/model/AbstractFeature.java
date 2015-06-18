
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}Selectable">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="serviceFeatures" type="{http://www.travellazy.com/product/model}AbstractFeatures" minOccurs="0"/>
 *         &lt;element name="adjustedNetCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeature", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "id",
    "featureKey",
    "serviceFeatures",
    "adjustedNetCharge"
})
@XmlSeeAlso({
    CreateFeature.class,
    UpdateFeature.class,
    DeleteFeature.class
})
public abstract class AbstractFeature
    extends Selectable
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long id;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String featureKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractFeatures serviceFeatures;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal adjustedNetCharge;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the featureKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureKey() {
        return featureKey;
    }

    /**
     * Sets the value of the featureKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureKey(String value) {
        this.featureKey = value;
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
     * Gets the value of the adjustedNetCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedNetCharge() {
        return adjustedNetCharge;
    }

    /**
     * Sets the value of the adjustedNetCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedNetCharge(BigDecimal value) {
        this.adjustedNetCharge = value;
    }

}

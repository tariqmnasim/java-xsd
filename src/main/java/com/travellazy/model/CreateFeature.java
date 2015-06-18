
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractFeature">
 *       &lt;sequence>
 *         &lt;element name="adjustedAllowanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.travellazy.com/product/model}AbstractFeatureValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFeature", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "adjustedAllowanceAmount",
    "value"
})
public class CreateFeature
    extends AbstractFeature
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal adjustedAllowanceAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractFeatureValue value;

    /**
     * Gets the value of the adjustedAllowanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedAllowanceAmount() {
        return adjustedAllowanceAmount;
    }

    /**
     * Sets the value of the adjustedAllowanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedAllowanceAmount(BigDecimal value) {
        this.adjustedAllowanceAmount = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractFeatureValue }
     *     
     */
    public AbstractFeatureValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractFeatureValue }
     *     
     */
    public void setValue(AbstractFeatureValue value) {
        this.value = value;
    }

}


package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}AbstractFeature">
 *       &lt;sequence>
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
@XmlType(name = "UpdateFeature", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "value"
})
public class UpdateFeature
    extends AbstractFeature
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected AbstractFeatureValue value;

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

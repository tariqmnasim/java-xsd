
package com.travellazy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travellazy.com/product/model}UsageData">
 *       &lt;sequence>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measuringUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "quantity",
    "duration",
    "measuringUnit"
})
@XmlRootElement(name = "volumeBasedUsageData", namespace = "http://www.travellazy.com/product/model")
public class VolumeBasedUsageData
    extends UsageData
{

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long quantity;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected int duration;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String measuringUnit;

    /**
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(int value) {
        this.duration = value;
    }

    /**
     * Gets the value of the measuringUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasuringUnit() {
        return measuringUnit;
    }

    /**
     * Sets the value of the measuringUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasuringUnit(String value) {
        this.measuringUnit = value;
    }

}


package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TieringLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TieringLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitsMin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitsMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TieringLevel", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "unitsMin",
    "unitsMax",
    "value"
})
public class TieringLevel {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long unitsMin;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long unitsMax;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal value;

    /**
     * Gets the value of the unitsMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitsMin() {
        return unitsMin;
    }

    /**
     * Sets the value of the unitsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitsMin(Long value) {
        this.unitsMin = value;
    }

    /**
     * Gets the value of the unitsMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitsMax() {
        return unitsMax;
    }

    /**
     * Sets the value of the unitsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitsMax(Long value) {
        this.unitsMax = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}


package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Specifies a [unitsMin, unitsMax) range - including unitsMin and excluding unitsMax - for which the given
 *                 charge is applied.
 *             
 * 
 * <p>Java class for RecurringTieringLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringTieringLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitsMin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="unitsMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringTieringLevel", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "unitsMin",
    "unitsMax",
    "charge"
})
public class RecurringTieringLevel {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected long unitsMin;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected Long unitsMax;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected BigDecimal charge;

    /**
     * Gets the value of the unitsMin property.
     * 
     */
    public long getUnitsMin() {
        return unitsMin;
    }

    /**
     * Sets the value of the unitsMin property.
     * 
     */
    public void setUnitsMin(long value) {
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
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharge(BigDecimal value) {
        this.charge = value;
    }

}


package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageAdjustment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeClusterKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billTypeKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adjustedChargePerUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageAdjustment", namespace = "http://www.travellazy.com/product/model", propOrder = {
    "chargeClusterKey",
    "billTypeKey",
    "adjustedChargePerUnit"
})
public class UsageAdjustment {

    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String chargeClusterKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model", required = true)
    protected String billTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal adjustedChargePerUnit;

    /**
     * Gets the value of the chargeClusterKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeClusterKey() {
        return chargeClusterKey;
    }

    /**
     * Sets the value of the chargeClusterKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeClusterKey(String value) {
        this.chargeClusterKey = value;
    }

    /**
     * Gets the value of the billTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillTypeKey() {
        return billTypeKey;
    }

    /**
     * Sets the value of the billTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillTypeKey(String value) {
        this.billTypeKey = value;
    }

    /**
     * Gets the value of the adjustedChargePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustedChargePerUnit() {
        return adjustedChargePerUnit;
    }

    /**
     * Sets the value of the adjustedChargePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustedChargePerUnit(BigDecimal value) {
        this.adjustedChargePerUnit = value;
    }

}

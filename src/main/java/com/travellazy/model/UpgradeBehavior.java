
package com.travellazy.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpgradeBehavior complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeBehavior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="isUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="earlyTerminationFeeHandlingTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="earlyTerminationFeeHandlingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="upDowngradeFeeFeatureKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeBehavior", namespace = "http://www.travellazy.com/product/model", propOrder = {

})
public class UpgradeBehavior {

    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected boolean isUpgrade;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String earlyTerminationFeeHandlingTypeKey;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected BigDecimal earlyTerminationFeeHandlingAmount;
    @XmlElement(namespace = "http://www.travellazy.com/product/model")
    protected String upDowngradeFeeFeatureKey;

    /**
     * Gets the value of the isUpgrade property.
     * 
     */
    public boolean isIsUpgrade() {
        return isUpgrade;
    }

    /**
     * Sets the value of the isUpgrade property.
     * 
     */
    public void setIsUpgrade(boolean value) {
        this.isUpgrade = value;
    }

    /**
     * Gets the value of the earlyTerminationFeeHandlingTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlyTerminationFeeHandlingTypeKey() {
        return earlyTerminationFeeHandlingTypeKey;
    }

    /**
     * Sets the value of the earlyTerminationFeeHandlingTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlyTerminationFeeHandlingTypeKey(String value) {
        this.earlyTerminationFeeHandlingTypeKey = value;
    }

    /**
     * Gets the value of the earlyTerminationFeeHandlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEarlyTerminationFeeHandlingAmount() {
        return earlyTerminationFeeHandlingAmount;
    }

    /**
     * Sets the value of the earlyTerminationFeeHandlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEarlyTerminationFeeHandlingAmount(BigDecimal value) {
        this.earlyTerminationFeeHandlingAmount = value;
    }

    /**
     * Gets the value of the upDowngradeFeeFeatureKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpDowngradeFeeFeatureKey() {
        return upDowngradeFeeFeatureKey;
    }

    /**
     * Sets the value of the upDowngradeFeeFeatureKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpDowngradeFeeFeatureKey(String value) {
        this.upDowngradeFeeFeatureKey = value;
    }

}
